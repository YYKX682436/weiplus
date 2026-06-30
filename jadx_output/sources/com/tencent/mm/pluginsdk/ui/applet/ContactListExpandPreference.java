package com.tencent.mm.pluginsdk.ui.applet;

/* loaded from: classes11.dex */
public class ContactListExpandPreference extends com.tencent.mm.ui.base.preference.Preference {
    public int L;
    public lz.f M;
    public lz.j N;

    public ContactListExpandPreference(android.content.Context context, int i17) {
        super(context);
        this.L = -1;
        if (i17 == 0) {
            M();
        } else if (i17 == 1) {
            this.L = 1;
            ((kz.a) ((lz.k) i95.n0.c(lz.k.class))).getClass();
            this.N = new r35.k2();
        }
        this.G = com.tencent.mm.R.layout.bz7;
    }

    public final void M() {
        this.L = 0;
        ((kz.a) ((lz.k) i95.n0.c(lz.k.class))).getClass();
        this.M = new r35.u1(this.f197770d);
    }

    public void N() {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.v1 v1Var = ((r35.u1) fVar).f369274f;
            v1Var.f369293i = false;
            v1Var.h();
        }
    }

    public void O(java.lang.String str, java.util.List list, boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.f369278j = str;
            if (list == null) {
                list = new java.util.ArrayList(0);
            }
            r35.v1 v1Var = u1Var.f369274f;
            v1Var.f369307z = true;
            v1Var.f369290f = list;
            v1Var.F = z17;
            v1Var.f369289e = null;
            u1Var.a(str);
        }
    }

    public void Q(java.util.List list) {
        O(null, list, true);
    }

    public void R(com.tencent.mm.ui.base.preference.r rVar, java.lang.String str) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.getClass();
            if (rVar == null || str == null) {
                return;
            }
            u1Var.f369270b = rVar;
            u1Var.f369271c = str;
            ((com.tencent.mm.ui.base.preference.h0) rVar).m(str, true);
        }
    }

    public void S(java.util.List list) {
        lz.f fVar = this.M;
        if (fVar != null) {
            r35.v1 v1Var = ((r35.u1) fVar).f369274f;
            v1Var.f369307z = true;
            v1Var.f369290f = list;
            v1Var.h();
        }
    }

    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference T(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.f369305x = z17;
        }
        return this;
    }

    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference V(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.f369304w = z17;
        }
        return this;
    }

    public void W(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).c(z17);
        }
    }

    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference Y(boolean z17) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.f369306y = z17;
        }
        return this;
    }

    public void Z(r35.d2 d2Var) {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369277i = d2Var;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void s() {
        lz.f fVar = this.M;
        if (fVar != null) {
            ((r35.u1) fVar).b();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.view.View childAt;
        if (this.L == 1) {
            r35.k2 k2Var = (r35.k2) this.N;
            k2Var.f369166e = view;
            android.view.ViewGroup viewGroup = view.getId() == com.tencent.mm.R.id.ceh ? (android.view.ViewGroup) view : (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ceh);
            int i17 = k2Var.f369163b;
            if (i17 == 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479876hp), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx));
            } else if (i17 == (k2Var.f369162a.getCount() / r35.v1.M) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479876hp));
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx));
            }
            r35.v1 v1Var = k2Var.f369162a;
            int i18 = v1Var.f369302u;
            int i19 = r35.v1.M;
            int i27 = i18 % i19;
            if ((i27 == i19 - 1 || i27 == 0) && k2Var.f369165d && k2Var.f369163b == (v1Var.getCount() / r35.v1.M) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
            } else if (!k2Var.f369165d) {
                r35.v1 v1Var2 = k2Var.f369162a;
                if (v1Var2.f369302u % r35.v1.M == 0 && k2Var.f369163b == (v1Var2.getCount() / r35.v1.M) - 1) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), (int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479924j3));
                }
            }
            if (k2Var.f369162a != null) {
                viewGroup.setOnClickListener(k2Var.f369169h);
                if (viewGroup.getChildCount() > r35.v1.M) {
                    viewGroup.removeViews(0, viewGroup.getChildCount() - r35.v1.M);
                    viewGroup.requestLayout();
                }
                for (int i28 = 0; i28 < k2Var.f369164c; i28++) {
                    if (viewGroup.getChildAt(i28) == null) {
                        childAt = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.chc, null);
                        viewGroup.addView(childAt);
                    } else {
                        childAt = viewGroup.getChildAt(i28);
                    }
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 49;
                    if (r35.v1.M == 4) {
                        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
                        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                    } else {
                        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
                        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    }
                    r35.v1 v1Var3 = k2Var.f369162a;
                    if (!(v1Var3.f369295n ? v1Var3.f369297p : com.tencent.mm.storage.z3.R4(v1Var3.C)) && k2Var.f369162a.f369302u == 1) {
                        int dimensionPixelSize3 = viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p);
                        layoutParams.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
                    }
                    childAt.setLayoutParams(layoutParams);
                    int i29 = (k2Var.f369163b * k2Var.f369164c) + i28;
                    k2Var.f369162a.getView(i29, childAt, viewGroup);
                    if (k2Var.f369167f != null) {
                        childAt.setOnClickListener(new r35.g2(k2Var, viewGroup, i29));
                    }
                    if (k2Var.f369168g != null) {
                        childAt.setOnLongClickListener(new r35.h2(k2Var, viewGroup, i29));
                    }
                    com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView avatarPatTipImageView = (com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView) childAt.findViewById(com.tencent.mm.R.id.m7e);
                    avatarPatTipImageView.setOnDoubleClickListener(new r35.i2(k2Var));
                    avatarPatTipImageView.setOnClickListener(new r35.j2(k2Var, viewGroup, i29));
                }
                r35.v1 v1Var4 = k2Var.f369162a;
                if ((v1Var4.f369295n ? v1Var4.f369297p : com.tencent.mm.storage.z3.R4(v1Var4.C)) || k2Var.f369162a.f369302u > 1) {
                    ((android.widget.LinearLayout) viewGroup).setGravity(17);
                } else {
                    ((android.widget.LinearLayout) viewGroup).setGravity(19);
                }
            }
        }
        super.t(view);
    }

    public ContactListExpandPreference(android.content.Context context) {
        super(context);
        this.L = -1;
        M();
        this.G = com.tencent.mm.R.layout.bz7;
    }

    public ContactListExpandPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
        M();
        this.G = com.tencent.mm.R.layout.bz7;
    }

    public ContactListExpandPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        M();
        this.G = com.tencent.mm.R.layout.bz7;
    }
}
