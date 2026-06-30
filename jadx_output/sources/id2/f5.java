package id2;

/* loaded from: classes3.dex */
public final class f5 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f290567d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f290568e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f290569f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f290570g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f290571h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290572i;

    /* renamed from: m, reason: collision with root package name */
    public r45.f82 f290573m;

    /* renamed from: n, reason: collision with root package name */
    public final id2.d5 f290574n;

    /* renamed from: o, reason: collision with root package name */
    public final kl2.g f290575o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290571h = new java.util.HashMap();
        id2.d5 d5Var = new id2.d5(this);
        this.f290574n = d5Var;
        this.f290575o = new kl2.g(getContext(), d5Var, new id2.u4(this), null);
    }

    public static final void O6(id2.f5 f5Var, boolean z17) {
        r45.ql1 ql1Var;
        r45.f82 f82Var = f5Var.f290573m;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.getCustom(2)) != null) {
            ql1Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            android.view.ViewGroup viewGroup = f5Var.f290568e;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("tipsMoneyLayout");
                throw null;
            }
            viewGroup.setVisibility(z17 ? 0 : 8);
            android.widget.TextView textView = f5Var.f290570g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("quotaTextView");
                throw null;
            }
            textView.setText(f5Var.getContext().getResources().getString(com.tencent.mm.R.string.ebm, java.lang.Long.valueOf(ql1Var.getLong(1))));
            f5Var.P6(ql1Var, true);
        }
        java.lang.String string = f5Var.getContext().getString(com.tencent.mm.R.string.ebk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (z17) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = f5Var.f290567d;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setContentDescription(f5Var.getContext().getString(com.tencent.mm.R.string.efy, string));
                return;
            } else {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = f5Var.f290567d;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setContentDescription(f5Var.getContext().getString(com.tencent.mm.R.string.efx, string));
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }

    public final void P6(r45.ql1 ql1Var, boolean z17) {
        com.tencent.mars.xlog.Log.e("FinderLiveRemindRestric", "updateQuotaMoneySetting amount " + ql1Var.getLong(1) + " enable: " + ql1Var.getInteger(0));
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new id2.e5(this, ql1Var, z17, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r10 = r0.getValue();
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            boolean r0 = r9.f290572i
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L56
            java.util.HashMap r11 = r9.f290571h
            monitor-enter(r11)
            java.util.Set r12 = r11.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L53
        L15:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L38
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r0.getKey()     // Catch: java.lang.Throwable -> L53
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L53
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L53
            if (r4 != r10) goto L2f
            r4 = r3
            goto L30
        L2f:
            r4 = r1
        L30:
            if (r4 == 0) goto L15
            java.lang.Object r10 = r0.getValue()     // Catch: java.lang.Throwable -> L53
            monitor-exit(r11)
            goto L3a
        L38:
            monitor-exit(r11)
            r10 = r2
        L3a:
            il2.a r10 = (il2.a) r10
            if (r10 == 0) goto La2
            androidx.appcompat.app.AppCompatActivity r11 = r9.getActivity()
            kotlinx.coroutines.y0 r3 = v65.m.b(r11)
            r4 = 0
            r5 = 0
            id2.x4 r6 = new id2.x4
            r6.<init>(r9, r10, r2)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.l.d(r3, r4, r5, r6, r7, r8)
            goto La2
        L53:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L56:
            if (r11 != r3) goto La2
            if (r12 == 0) goto La2
            java.lang.String r10 = "KEY_SELECT_MOUNT"
            r4 = 0
            long r10 = r12.getLongExtra(r10, r4)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 <= 0) goto La2
            r45.f82 r12 = r9.f290573m
            if (r12 == 0) goto La2
            r0 = 2
            com.tencent.mm.protobuf.f r12 = r12.getCustom(r0)
            r45.ql1 r12 = (r45.ql1) r12
            if (r12 == 0) goto La2
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r12.set(r3, r0)
            android.widget.TextView r0 = r9.f290570g
            if (r0 == 0) goto L9c
            android.app.Activity r2 = r9.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r11 = 2131765927(0x7f102aa7, float:1.916303E38)
            java.lang.String r10 = r2.getString(r11, r10)
            r0.setText(r10)
            r9.P6(r12, r1)
            goto La2
        L9c:
            java.lang.String r10 = "quotaTextView"
            kotlin.jvm.internal.o.o(r10)
            throw r2
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.f5.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[ORIG_RETURN, RETURN] */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.f5.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f290571h = new java.util.HashMap();
        id2.d5 d5Var = new id2.d5(this);
        this.f290574n = d5Var;
        this.f290575o = new kl2.g(getContext(), d5Var, new id2.u4(this), null);
    }
}
