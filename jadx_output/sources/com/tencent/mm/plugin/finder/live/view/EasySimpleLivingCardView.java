package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/EasySimpleLivingCardView;", "Landroid/widget/RelativeLayout;", "Lyo0/i;", "getImageLoadOption", "Lr45/qt2;", "d", "Lr45/qt2;", "getReportObj", "()Lr45/qt2;", "setReportObj", "(Lr45/qt2;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class EasySimpleLivingCardView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public r45.qt2 reportObj;

    /* renamed from: e, reason: collision with root package name */
    public float f115774e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f115775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasySimpleLivingCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115774e = 1.7776f;
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.dmg, this).findViewById(com.tencent.mm.R.id.k69);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115775f = (android.view.ViewGroup) findViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView r9, com.tencent.mm.protocal.protobuf.FinderObject r10, int r11, float r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView.e(com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView, com.tencent.mm.protocal.protobuf.FinderObject, int, float, int, int, java.lang.Object):void");
    }

    private final yo0.i getImageLoadOption() {
        return mn2.g1.f329975a.h(mn2.f1.f329953d);
    }

    public final void a(r45.mb4 mb4Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17) {
        java.lang.String str;
        android.view.ViewGroup viewGroup = this.f115775f;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f487295o70);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.icp);
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i17;
        float f17 = i17;
        layoutParams.height = (int) (this.f115774e * f17);
        imageView.setLayoutParams(layoutParams);
        findViewById.getLayoutParams().width = layoutParams.width;
        findViewById.getLayoutParams().height = layoutParams.height;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (this.f115774e * f17);
        }
        viewGroup.requestLayout();
        java.lang.String string = mb4Var.getString(16);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb6.append(string3 != null ? string3 : "");
            str = sb6.toString();
        } else {
            str = concat;
        }
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, getImageLoadOption());
            return;
        }
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb.g7((c61.zb) c17, imageView, str, 0, 4, null);
    }

    public void b(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    public void c(com.tencent.mm.plugin.finder.storage.FinderItem item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    public void d(com.tencent.mm.plugin.finder.storage.FinderItem item, java.lang.String contextId) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        android.content.Intent intent = new android.content.Intent();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(item.getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, contextId);
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, item.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, arrayList, 0, wk0Var, null);
    }

    public final r45.qt2 getReportObj() {
        return this.reportObj;
    }

    public final void setReportObj(r45.qt2 qt2Var) {
        this.reportObj = qt2Var;
    }
}
