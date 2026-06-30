package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/f0;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class BizProfileTabCommonFragment<T extends wr3.f0> extends com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f154426p;

    /* renamed from: q, reason: collision with root package name */
    public final int f154427q;

    /* renamed from: r, reason: collision with root package name */
    public final sr3.g f154428r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f154429s;

    /* renamed from: t, reason: collision with root package name */
    public long f154430t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154431u;

    /* renamed from: v, reason: collision with root package name */
    public wr3.f0 f154432v;

    public BizProfileTabCommonFragment(boolean z17, int i17, sr3.g config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f154426p = z17;
        this.f154427q = i17;
        this.f154428r = config;
        this.f154429s = new java.util.LinkedList();
    }

    public void A0(java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
    }

    public void B0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        this.f154412e = dataFetcher;
        C0();
        dataFetcher.f154282m.observe(this, new wr3.h0(this));
        y0(dataFetcher, new wr3.i0(this));
        dataFetcher.f154288s.observe(this, new wr3.j0(this));
        dataFetcher.f154289t.observe(this, new wr3.k0(this));
        androidx.lifecycle.j0 w07 = w0(dataFetcher);
        if (w07 != null) {
            w07.observe(this, new wr3.l0(this, dataFetcher));
        }
    }

    public void C0() {
    }

    public abstract void F0(r45.wl wlVar, r45.tj6 tj6Var);

    public abstract boolean G0(vr3.h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r6 != null && r6.f387453e == 0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(java.util.List r4, java.util.LinkedList r5, r45.ul r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r3 = this;
            java.lang.String r8 = "msgList"
            kotlin.jvm.internal.o.g(r4, r8)
            java.lang.String r8 = "footerWording"
            kotlin.jvm.internal.o.g(r7, r8)
            boolean r7 = r4.isEmpty()
            r8 = 1
            r7 = r7 ^ r8
            java.util.LinkedList r0 = r3.f154429s
            r1 = 0
            if (r7 != 0) goto L1f
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r8
            if (r7 == 0) goto L1d
            goto L1f
        L1d:
            r7 = r1
            goto L20
        L1f:
            r7 = r8
        L20:
            wr3.f0 r2 = r3.r0()
            if (r7 == 0) goto L32
            if (r6 == 0) goto L2e
            int r7 = r6.f387453e
            if (r7 != 0) goto L2e
            r7 = r8
            goto L2f
        L2e:
            r7 = r1
        L2f:
            if (r7 == 0) goto L32
            goto L33
        L32:
            r8 = r1
        L33:
            boolean r7 = r2.f448788w
            if (r7 != r8) goto L38
            goto L49
        L38:
            r2.f448788w = r8
            int r7 = r2.getItemCount()
            if (r7 <= 0) goto L49
            java.util.ArrayList r7 = r2.f448786u
            int r7 = r7.size()
            r2.notifyItemChanged(r7)
        L49:
            wr3.f0 r7 = r3.r0()
            r7.f448787v = r6
            java.util.ArrayList r6 = r7.f448786u
            r6.clear()
            java.util.List r4 = r7.M(r4, r5, r0)
            r6.addAll(r4)
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment.H0(java.util.List, java.util.LinkedList, r45.ul, java.lang.String, java.lang.Integer):void");
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        z0(r0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        r45.tj6 t07 = t0(m0());
        r45.ul ulVar = null;
        java.util.List list = (t07 == null || (glVar4 = t07.f386509e) == null) ? null : glVar4.f375323d;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        r45.tj6 t08 = t0(m0());
        java.util.LinkedList linkedList = (t08 == null || (glVar3 = t08.f386509e) == null) ? null : glVar3.f375327h;
        r45.tj6 t09 = t0(m0());
        java.lang.Integer valueOf = (t09 == null || (glVar2 = t09.f386509e) == null) ? null : java.lang.Integer.valueOf(glVar2.f375328i);
        r45.tj6 t010 = t0(m0());
        if (t010 != null && (glVar = t010.f386509e) != null) {
            ulVar = glVar.f375326g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.tencent.mm.plugin.profile.ui.tab.b.c(m0(), getContext());
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String str = c17;
        if (!list.isEmpty()) {
            H0(list, linkedList, ulVar2, str, valueOf);
            A0(list);
        }
        r0().f448815e = new wr3.g0(this);
    }

    public abstract java.util.ArrayList q0(r45.wl wlVar);

    public final wr3.f0 r0() {
        wr3.f0 f0Var = this.f154432v;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    /* renamed from: s0 */
    public abstract java.lang.String getF154421w();

    public abstract r45.tj6 t0(r45.wl wlVar);

    public abstract java.lang.String u0();

    public abstract androidx.lifecycle.j0 w0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher);

    public abstract void x0(com.tencent.mm.protobuf.g gVar);

    public abstract void y0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher, androidx.lifecycle.k0 k0Var);

    public void z0(wr3.f0 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
    }
}
