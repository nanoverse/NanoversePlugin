// This is a generated file. Not intended for manual editing.
package com.nanoverseplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.nanoverseplugin.psi.NanoverseTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.nanoverseplugin.psi.*;

public class NanoversePrimitiveImpl extends ASTWrapperPsiElement implements NanoversePrimitive {

  public NanoversePrimitiveImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NanoverseVisitor) ((NanoverseVisitor)visitor).visitPrimitive(this);
    else super.accept(visitor);
  }

}
