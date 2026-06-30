package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class l0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f207542m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f207543n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f207544o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f207545p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.aff.ext_device.n f207546q;

    public l0(android.content.Context context) {
        super(context);
        this.f207546q = com.tencent.wechat.aff.ext_device.n.ExtDeviceSync_Unknow;
        com.tencent.wechat.aff.ext_device.m mVar = com.tencent.wechat.aff.ext_device.m.f216700c;
        this.f207546q = mVar.a("");
        i();
        mVar.d("device_sync_status_changed_Android", new com.tencent.mm.ui.conversation.banner.l0$$a(this));
    }

    @Override // s35.b
    public void a() {
        com.tencent.wechat.aff.ext_device.m.f216700c.f("device_sync_status_changed_Android");
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.c8u;
    }

    @Override // s35.b
    public int c() {
        return 2;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f207543n = view.findViewById(com.tencent.mm.R.id.aey);
        this.f207542m = view.findViewById(com.tencent.mm.R.id.f483351af3);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483347af0);
        this.f207545p = weImageView;
        weImageView.setIconColor(((android.content.Context) this.f402842g.get()).getResources().getColor(com.tencent.mm.R.color.BW_50));
        this.f207544o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483353af5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x004d, code lost:
    
        if (((ug3.i.f427541o & 2) != 0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x006a, code lost:
    
        if (r0 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        if ((ug3.i.f427539m != c01.d9.b().x()) != false) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.banner.l0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OtherOnlineBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f207543n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void l(java.lang.StringBuilder sb6) {
        int ordinal = this.f207546q.ordinal();
        java.lang.String string = ordinal != 2 ? ordinal != 4 ? null : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p5c) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p5d);
        if (string != null) {
            sb6.append(java.lang.String.format("（%s）", string));
        }
    }

    public final void m(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17) {
        java.lang.Object tag = weImageView.getTag();
        boolean z17 = true;
        if (tag != null && ((java.lang.Integer) tag).intValue() == i17) {
            z17 = false;
        }
        if (z17) {
            weImageView.setTag(java.lang.Integer.valueOf(i17));
            weImageView.setImageResource(i17);
        }
    }
}
