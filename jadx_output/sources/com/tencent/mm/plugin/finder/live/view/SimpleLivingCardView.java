package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/SimpleLivingCardView;", "Landroid/widget/RelativeLayout;", "Lyo0/i;", "getImageLoadOption", "Lr45/qt2;", "d", "Lr45/qt2;", "getReportObj", "()Lr45/qt2;", "setReportObj", "(Lr45/qt2;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SimpleLivingCardView extends android.widget.RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f116134g = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public r45.qt2 reportObj;

    /* renamed from: e, reason: collision with root package name */
    public float f116136e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f116137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLivingCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116136e = 1.7776f;
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.azq, this).findViewById(com.tencent.mm.R.id.k69);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116137f = (android.view.ViewGroup) findViewById;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "live_room_card");
        aVar.ik(this, 40, 26236);
    }

    public static final void a(com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView, java.lang.String str) {
        simpleLivingCardView.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("key_enter_profile_type", 11);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = simpleLivingCardView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ok(str);
    }

    private final yo0.i getImageLoadOption() {
        return mn2.g1.f329975a.h(mn2.f1.f329953d);
    }

    public final void b(r45.mb4 mb4Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.lang.String str;
        android.view.ViewGroup viewGroup = this.f116137f;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f487295o70);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.icp);
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        int width = getWidth() > 0 ? getWidth() : getLayoutParams().width;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = width;
        float f17 = width;
        layoutParams.height = (int) (this.f116136e * f17);
        imageView.setLayoutParams(layoutParams);
        findViewById.getLayoutParams().width = layoutParams.width;
        findViewById.getLayoutParams().height = layoutParams.height;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = width;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (this.f116136e * f17);
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:140:0x007a, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r7 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.mm.protocal.protobuf.FinderObject r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView.c(com.tencent.mm.protocal.protobuf.FinderObject, int, float):void");
    }

    public final r45.qt2 getReportObj() {
        return this.reportObj;
    }

    public final void setReportObj(r45.qt2 qt2Var) {
        this.reportObj = qt2Var;
    }
}
