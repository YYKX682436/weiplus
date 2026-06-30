package com.tencent.mm.ui.widget.code;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/ui/widget/code/CodeItemView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lll5/a;", "Landroid/view/View;", "view", "Ljz5/f0;", "setBottomView", "Lkotlin/Function1;", "h", "Lyz5/l;", "getItemClickListener", "()Lyz5/l;", "setItemClickListener", "(Lyz5/l;)V", "itemClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CodeItemView extends com.tencent.mm.mvvm.MvvmView<ll5.a> {

    /* renamed from: f, reason: collision with root package name */
    public em.b0 f211628f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f211629g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l itemClickListener;

    /* renamed from: i, reason: collision with root package name */
    public boolean f211631i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f211632m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f211633n;

    public /* synthetic */ CodeItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488626e30, (android.view.ViewGroup) null);
        this.f211628f = new em.b0(inflate);
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        ll5.a aVar = (ll5.a) pVar2;
        if (aVar != null) {
            em.b0 b0Var = this.f211628f;
            if (b0Var == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var.f254104e == null) {
                b0Var.f254104e = (com.tencent.mm.ui.widget.imageview.WeImageView) b0Var.f254100a.findViewById(com.tencent.mm.R.id.u7b);
            }
            b0Var.f254104e.setImageResource(aVar.f319266d);
            if (aVar.f319267e != 0) {
                em.b0 b0Var2 = this.f211628f;
                if (b0Var2 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                if (b0Var2.f254104e == null) {
                    b0Var2.f254104e = (com.tencent.mm.ui.widget.imageview.WeImageView) b0Var2.f254100a.findViewById(com.tencent.mm.R.id.u7b);
                }
                b0Var2.f254104e.setIconColor(aVar.f319267e);
            }
            em.b0 b0Var3 = this.f211628f;
            if (b0Var3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var3.f254101b == null) {
                b0Var3.f254101b = (android.widget.TextView) b0Var3.f254100a.findViewById(com.tencent.mm.R.id.vir);
            }
            b0Var3.f254101b.setText(aVar.f319268f);
            em.b0 b0Var4 = this.f211628f;
            if (b0Var4 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            b0Var4.e().setText(aVar.f319269g);
            ll5.e eVar = new ll5.e(this, aVar);
            em.b0 b0Var5 = this.f211628f;
            if (b0Var5 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var5.f254110k == null) {
                b0Var5.f254110k = (android.widget.LinearLayout) b0Var5.f254100a.findViewById(com.tencent.mm.R.id.f483755st2);
            }
            b0Var5.f254110k.setOnClickListener(eVar);
            em.b0 b0Var6 = this.f211628f;
            if (b0Var6 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var6.f254105f == null) {
                b0Var6.f254105f = (android.widget.FrameLayout) b0Var6.f254100a.findViewById(com.tencent.mm.R.id.vao);
            }
            b0Var6.f254105f.setOnClickListener(eVar);
            boolean z17 = this.f211632m;
            boolean z18 = aVar.f319270h;
            if (z17 != z18) {
                this.f211632m = z18;
                yz5.p pVar3 = aVar.f319271i;
                if (pVar3 != null) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                    em.b0 b0Var7 = this.f211628f;
                    if (b0Var7 == null) {
                        kotlin.jvm.internal.o.o("holder");
                        throw null;
                    }
                    android.widget.FrameLayout c17 = b0Var7.c();
                    kotlin.jvm.internal.o.f(c17, "getExpandContentContainer(...)");
                    pVar3.invoke(valueOf, c17);
                }
                if (this.f211631i) {
                    h(aVar.f319270h, false);
                } else {
                    h(aVar.f319270h, true);
                }
            } else if (this.f211631i) {
                h(z18, false);
            }
            em.b0 b0Var8 = this.f211628f;
            if (b0Var8 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var8.f254102c == null) {
                b0Var8.f254102c = (com.tencent.mm.ui.widget.imageview.WeImageView) b0Var8.f254100a.findViewById(com.tencent.mm.R.id.u7c);
            }
            b0Var8.f254102c.setVisibility(aVar.f319272m ? 0 : 8);
            em.b0 b0Var9 = this.f211628f;
            if (b0Var9 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var9.f254102c == null) {
                b0Var9.f254102c = (com.tencent.mm.ui.widget.imageview.WeImageView) b0Var9.f254100a.findViewById(com.tencent.mm.R.id.u7c);
            }
            b0Var9.f254102c.setOnClickListener(new ll5.d(aVar));
            this.f211631i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r20, android.view.View r21, boolean r22, yz5.a r23) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.code.CodeItemView.g(android.view.View, android.view.View, boolean, yz5.a):void");
    }

    public final yz5.l getItemClickListener() {
        return this.itemClickListener;
    }

    public final void h(boolean z17, boolean z18) {
        if (!z18 || this.f211633n) {
            em.b0 b0Var = this.f211628f;
            if (b0Var == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            b0Var.e().setVisibility(z17 ? 8 : 0);
            em.b0 b0Var2 = this.f211628f;
            if (b0Var2 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            b0Var2.c().setVisibility(z17 ? 0 : 8);
            em.b0 b0Var3 = this.f211628f;
            if (b0Var3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            b0Var3.d().setRotation(z17 ? 270.0f : 90.0f);
            if (z17) {
                em.b0 b0Var4 = this.f211628f;
                if (b0Var4 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                b0Var4.c().getLayoutParams().height = -2;
            } else {
                em.b0 b0Var5 = this.f211628f;
                if (b0Var5 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                b0Var5.e().getLayoutParams().height = -2;
            }
            em.b0 b0Var6 = this.f211628f;
            if (b0Var6 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var6.a().getVisibility() == 0) {
                em.b0 b0Var7 = this.f211628f;
                if (b0Var7 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                b0Var7.b().setVisibility(z17 ? 0 : 8);
                em.b0 b0Var8 = this.f211628f;
                if (b0Var8 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                b0Var8.b().getLayoutParams().height = -2;
                em.b0 b0Var9 = this.f211628f;
                if (b0Var9 != null) {
                    b0Var9.b().setAlpha(1.0f);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
            }
            return;
        }
        if (z17) {
            android.animation.ValueAnimator valueAnimator = this.f211629g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f211629g = null;
            this.f211633n = true;
            em.b0 b0Var10 = this.f211628f;
            if (b0Var10 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            b0Var10.d().animate().rotation(270.0f).setDuration(200L).start();
            em.b0 b0Var11 = this.f211628f;
            if (b0Var11 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.widget.FrameLayout c17 = b0Var11.c();
            kotlin.jvm.internal.o.f(c17, "getExpandContentContainer(...)");
            em.b0 b0Var12 = this.f211628f;
            if (b0Var12 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.widget.TextView e17 = b0Var12.e();
            kotlin.jvm.internal.o.f(e17, "getTvItemSubTitle(...)");
            g(c17, e17, true, new ll5.c(this));
            return;
        }
        android.animation.ValueAnimator valueAnimator2 = this.f211629g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f211629g = null;
        this.f211633n = true;
        em.b0 b0Var13 = this.f211628f;
        if (b0Var13 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        b0Var13.d().animate().rotation(90.0f).setDuration(200L).start();
        em.b0 b0Var14 = this.f211628f;
        if (b0Var14 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        android.widget.TextView e18 = b0Var14.e();
        kotlin.jvm.internal.o.f(e18, "getTvItemSubTitle(...)");
        em.b0 b0Var15 = this.f211628f;
        if (b0Var15 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        android.widget.FrameLayout c18 = b0Var15.c();
        kotlin.jvm.internal.o.f(c18, "getExpandContentContainer(...)");
        g(e18, c18, false, new ll5.b(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f211629g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f211629g = null;
        em.b0 b0Var = this.f211628f;
        if (b0Var != null) {
            b0Var.d().clearAnimation();
        } else {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
    }

    public final void setBottomView(android.view.View view) {
        em.b0 b0Var = this.f211628f;
        if (b0Var == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        b0Var.a().removeAllViews();
        if (view == null) {
            em.b0 b0Var2 = this.f211628f;
            if (b0Var2 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (b0Var2.f254109j == null) {
                b0Var2.f254109j = b0Var2.f254100a.findViewById(com.tencent.mm.R.id.au8);
            }
            android.view.View view2 = b0Var2.f254109j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            em.b0 b0Var3 = this.f211628f;
            if (b0Var3 != null) {
                b0Var3.a().setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        em.b0 b0Var4 = this.f211628f;
        if (b0Var4 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        b0Var4.a().addView(view);
        em.b0 b0Var5 = this.f211628f;
        if (b0Var5 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (b0Var5.f254109j == null) {
            b0Var5.f254109j = b0Var5.f254100a.findViewById(com.tencent.mm.R.id.au8);
        }
        android.view.View view3 = b0Var5.f254109j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.b0 b0Var6 = this.f211628f;
        if (b0Var6 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        b0Var6.a().setVisibility(0);
        em.b0 b0Var7 = this.f211628f;
        if (b0Var7 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        b0Var7.b().setVisibility(this.f211632m ? 0 : 8);
        em.b0 b0Var8 = this.f211628f;
        if (b0Var8 != null) {
            b0Var8.b().setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
    }

    public final void setItemClickListener(yz5.l lVar) {
        this.itemClickListener = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211631i = true;
    }
}
