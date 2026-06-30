package com.tencent.mm.plugin.recordvideo.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "Landroid/widget/RelativeLayout;", "Lru3/c;", "Ldm/rb;", "videoEditData", "Ljz5/f0;", "setFakeVideoInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FakeVideoViewLayer extends android.widget.RelativeLayout implements ru3.c {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f155885s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f155886d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hi0 f155887e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayer f155888f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f155889g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f155890h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f155891i;

    /* renamed from: m, reason: collision with root package name */
    public zv3.g f155892m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155893n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f155894o;

    /* renamed from: p, reason: collision with root package name */
    public int f155895p;

    /* renamed from: q, reason: collision with root package name */
    public int f155896q;

    /* renamed from: r, reason: collision with root package name */
    public int f155897r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeVideoViewLayer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155886d = "MicroMsg.FakeVideoViewLayer";
    }

    public final void a(zv3.g gVar) {
        boolean z17 = this.f155893n;
        java.lang.String str = this.f155886d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "requestLoopFakeFrame stop");
            return;
        }
        if (!kotlin.jvm.internal.o.b(gVar, this.f155892m)) {
            com.tencent.mars.xlog.Log.i(str, "requestLoopFakeFrame frameRetriever not match");
            return;
        }
        r45.hi0 hi0Var = this.f155887e;
        if ((hi0Var != null && hi0Var.f376198y) || !this.f155894o) {
            com.tencent.mars.xlog.Log.i(str, "requestLoopFakeFrame local capture video or not useFakeImage");
            return;
        }
        zv3.a a17 = gVar.a();
        android.widget.ImageView imageView = this.f155891i;
        if (imageView != null) {
            imageView.setImageBitmap(a17 != null ? a17.f476427a : null);
        }
        android.widget.ImageView imageView2 = this.f155891i;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (a17 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(a17.f476428b);
            long longValue = valueOf.longValue();
            java.lang.Long l17 = ((1L > longValue ? 1 : (1L == longValue ? 0 : -1)) <= 0 && (longValue > 1001L ? 1 : (longValue == 1001L ? 0 : -1)) < 0) && this.f155893n && kotlin.jvm.internal.o.b(gVar, this.f155892m) ? valueOf : null;
            if (l17 != null) {
                long longValue2 = l17.longValue();
                android.widget.ImageView imageView3 = this.f155891i;
                if (imageView3 != null) {
                    imageView3.postDelayed(new ru3.b(this, gVar), longValue2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // ru3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFakeVideoInfo(dm.rb r10) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer.setFakeVideoInfo(dm.rb):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeVideoViewLayer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155886d = "MicroMsg.FakeVideoViewLayer";
    }
}
