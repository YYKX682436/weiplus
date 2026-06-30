package com.tencent.mm.plugin.profile.ui.mod.permission_view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u00104\u001a\u00020\u001e¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b5\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R*\u0010%\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView;", "Landroid/widget/LinearLayout;", "", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "setTalkOnly", "setNotSee", "setNotAllowSee", "", "desc", "setHint", "Lkotlin/Function0;", "d", "Lyz5/a;", "getOnChange", "()Lyz5/a;", "setOnChange", "(Lyz5/a;)V", "onChange", "value", "e", "Z", "isOpenIM", "()Z", "setOpenIM", "(Z)V", "f", "getEnableChatOnly", "setEnableChatOnly", "enableChatOnly", "", "g", "I", "getPermission", "()I", "setPermission", "(I)V", "permission", "h", "getSex", "setSex", "sex", "Lem/c0;", "i", "Ljz5/g;", "getUiBinding", "()Lem/c0;", "uiBinding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PermissionView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a onChange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isOpenIM;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean enableChatOnly;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int permission;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int sex;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g uiBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionView(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.Integer num, java.lang.Integer num2) {
        super(context, attributeSet, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.onChange = or3.e.f347690d;
        this.enableChatOnly = true;
        this.uiBinding = jz5.h.b(new or3.f(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e3x, this);
        getUiBinding().g().setOnClickListener(new or3.a(this));
        getUiBinding().h().setOnClickListener(new or3.b(this));
        em.c0 uiBinding = getUiBinding();
        if (uiBinding.f254152d == null) {
            uiBinding.f254152d = (com.tencent.mm.ui.widget.MMSwitchBtn) uiBinding.f254149a.findViewById(com.tencent.mm.R.id.kdu);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = uiBinding.f254152d;
        mMSwitchBtn = mMSwitchBtn instanceof com.tencent.mm.ui.widget.MMSwitchBtn ? mMSwitchBtn : null;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setSwitchListener(new or3.c(this));
        }
        em.c0 uiBinding2 = getUiBinding();
        if (uiBinding2.f254155g == null) {
            uiBinding2.f254155g = (com.tencent.mm.ui.widget.MMSwitchBtn) uiBinding2.f254149a.findViewById(com.tencent.mm.R.id.f486159ke3);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = uiBinding2.f254155g;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = mMSwitchBtn2 instanceof com.tencent.mm.ui.widget.MMSwitchBtn ? mMSwitchBtn2 : null;
        if (mMSwitchBtn3 != null) {
            mMSwitchBtn3.setSwitchListener(new or3.d(this));
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNotAllowSee(boolean z17) {
        setPermission(z17 ? this.permission | 1 : this.permission & (-2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNotSee(boolean z17) {
        setPermission(z17 ? this.permission | 2 : this.permission & (-3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTalkOnly(boolean z17) {
        setPermission(z17 ? this.permission | 8 : this.permission & (-9));
    }

    public final void d(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null) {
            return;
        }
        if (z3Var.y2()) {
            setTalkOnly(true);
        } else {
            boolean x27 = z3Var.x2();
            boolean P0 = ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(z3Var.d1(), 5L);
            if (x27) {
                setNotAllowSee(true);
            }
            if (P0) {
                setNotSee(true);
            }
        }
        this.sex = z3Var.I;
        setOpenIM(com.tencent.mm.storage.z3.m4(z3Var.d1()) && kotlin.jvm.internal.o.b("3552365301", z3Var.Q0()));
        f();
    }

    public final boolean e() {
        return (this.permission & 1) != 0;
    }

    public final void f() {
        int i17 = this.sex;
        if (i17 == 0 || i17 == 1) {
            em.c0 uiBinding = getUiBinding();
            if (uiBinding.f254151c == null) {
                uiBinding.f254151c = (android.widget.TextView) uiBinding.f254149a.findViewById(com.tencent.mm.R.id.kdv);
            }
            uiBinding.f254151c.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493229ok1));
            em.c0 uiBinding2 = getUiBinding();
            if (uiBinding2.f254156h == null) {
                uiBinding2.f254156h = (android.widget.TextView) uiBinding2.f254149a.findViewById(com.tencent.mm.R.id.f486160ke4);
            }
            uiBinding2.f254156h.setText(i65.a.r(getContext(), com.tencent.mm.R.string.oj6));
        } else if (i17 == 2) {
            em.c0 uiBinding3 = getUiBinding();
            if (uiBinding3.f254151c == null) {
                uiBinding3.f254151c = (android.widget.TextView) uiBinding3.f254149a.findViewById(com.tencent.mm.R.id.kdv);
            }
            uiBinding3.f254151c.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493228ok0));
            em.c0 uiBinding4 = getUiBinding();
            if (uiBinding4.f254156h == null) {
                uiBinding4.f254156h = (android.widget.TextView) uiBinding4.f254149a.findViewById(com.tencent.mm.R.id.f486160ke4);
            }
            uiBinding4.f254156h.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f493200oj5));
        }
        if (this.isOpenIM) {
            getUiBinding().h().setVisibility(8);
            getUiBinding().g().setVisibility(8);
            getUiBinding().a().setVisibility(8);
            android.view.View d17 = getUiBinding().d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c17 = getUiBinding().c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getUiBinding().b().setVisibility(0);
            getUiBinding().f().setVisibility(0);
            getUiBinding().e().setBackground(null);
        } else if (this.enableChatOnly) {
            getUiBinding().h().setVisibility(0);
            getUiBinding().g().setVisibility(0);
            getUiBinding().a().setVisibility(0);
            android.view.View d18 = getUiBinding().d();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(d18, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(d18, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c18 = getUiBinding().c();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(c18, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getUiBinding().b().setVisibility(8);
            getUiBinding().e().setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.bfj));
            if ((this.permission & 8) != 0) {
                getUiBinding().f().setVisibility(8);
                em.c0 uiBinding5 = getUiBinding();
                if (uiBinding5.f254153e == null) {
                    uiBinding5.f254153e = (com.tencent.mm.ui.widget.imageview.WeImageView) uiBinding5.f254149a.findViewById(com.tencent.mm.R.id.n_y);
                }
                uiBinding5.f254153e.setVisibility(4);
                em.c0 uiBinding6 = getUiBinding();
                if (uiBinding6.f254163o == null) {
                    uiBinding6.f254163o = (com.tencent.mm.ui.widget.imageview.WeImageView) uiBinding6.f254149a.findViewById(com.tencent.mm.R.id.nxq);
                }
                uiBinding6.f254163o.setVisibility(0);
            } else {
                getUiBinding().f().setVisibility(0);
                em.c0 uiBinding7 = getUiBinding();
                if (uiBinding7.f254153e == null) {
                    uiBinding7.f254153e = (com.tencent.mm.ui.widget.imageview.WeImageView) uiBinding7.f254149a.findViewById(com.tencent.mm.R.id.n_y);
                }
                uiBinding7.f254153e.setVisibility(0);
                em.c0 uiBinding8 = getUiBinding();
                if (uiBinding8.f254163o == null) {
                    uiBinding8.f254163o = (com.tencent.mm.ui.widget.imageview.WeImageView) uiBinding8.f254149a.findViewById(com.tencent.mm.R.id.nxq);
                }
                uiBinding8.f254163o.setVisibility(8);
            }
        } else {
            getUiBinding().h().setVisibility(8);
            getUiBinding().g().setVisibility(8);
            getUiBinding().a().setVisibility(0);
            android.view.View d19 = getUiBinding().d();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(d19, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d19.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(d19, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c19 = getUiBinding().c();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(c19, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(c19, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView", "updateUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getUiBinding().b().setVisibility(8);
            getUiBinding().f().setVisibility(0);
            getUiBinding().e().setBackground(null);
        }
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn);
        getUiBinding().e().setPadding(0, f17, f17, f17);
        em.c0 uiBinding9 = getUiBinding();
        if (uiBinding9.f254152d == null) {
            uiBinding9.f254152d = (com.tencent.mm.ui.widget.MMSwitchBtn) uiBinding9.f254149a.findViewById(com.tencent.mm.R.id.kdu);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = uiBinding9.f254152d;
        if (!(mMSwitchBtn instanceof com.tencent.mm.ui.widget.MMSwitchBtn)) {
            mMSwitchBtn = null;
        }
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck((this.permission & 1) == 1);
        }
        em.c0 uiBinding10 = getUiBinding();
        if (uiBinding10.f254155g == null) {
            uiBinding10.f254155g = (com.tencent.mm.ui.widget.MMSwitchBtn) uiBinding10.f254149a.findViewById(com.tencent.mm.R.id.f486159ke3);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = uiBinding10.f254155g;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = mMSwitchBtn2 instanceof com.tencent.mm.ui.widget.MMSwitchBtn ? mMSwitchBtn2 : null;
        if (mMSwitchBtn3 == null) {
            return;
        }
        mMSwitchBtn3.setCheck((this.permission & 2) == 2);
    }

    public final boolean getEnableChatOnly() {
        return this.enableChatOnly;
    }

    public final yz5.a getOnChange() {
        return this.onChange;
    }

    public final int getPermission() {
        return this.permission;
    }

    public final int getSex() {
        return this.sex;
    }

    public final em.c0 getUiBinding() {
        return (em.c0) ((jz5.n) this.uiBinding).getValue();
    }

    public final void setEnableChatOnly(boolean z17) {
        this.enableChatOnly = z17;
        if (!z17) {
            setPermission(this.permission & (-9));
        } else {
            f();
            this.onChange.invoke();
        }
    }

    public final void setHint(java.lang.String str) {
        if (str == null) {
            getUiBinding().b().setVisibility(8);
        } else {
            getUiBinding().b().setText(str);
            getUiBinding().b().setVisibility(0);
        }
    }

    public final void setOnChange(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.onChange = aVar;
    }

    public final void setOpenIM(boolean z17) {
        this.isOpenIM = z17;
        if (z17) {
            setPermission(this.permission & 2);
        } else {
            f();
            this.onChange.invoke();
        }
    }

    public final void setPermission(int i17) {
        this.permission = i17;
        f();
        this.onChange.invoke();
    }

    public final void setSex(int i17) {
        this.sex = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, java.lang.Integer.valueOf(i17), 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
