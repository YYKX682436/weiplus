package fq0;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fq0.x f265470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f265471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, java.lang.String str2, fq0.x xVar, yz5.p pVar) {
        super(0);
        this.f265468d = str;
        this.f265469e = str2;
        this.f265470f = xVar;
        this.f265471g = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGestureRects viewId:");
        java.lang.String viewId = this.f265468d;
        sb6.append(viewId);
        sb6.append(", rects:");
        java.lang.String rects = this.f265469e;
        sb6.append(rects);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", sb6.toString());
        hq0.e0 e0Var = this.f265470f.f265479c;
        if (e0Var != null) {
            kotlin.jvm.internal.o.g(viewId, "viewId");
            kotlin.jvm.internal.o.g(rects, "rects");
            yz5.p callback = this.f265471g;
            kotlin.jvm.internal.o.g(callback, "callback");
            hq0.f fVar = e0Var.f282988i.f283002q;
            if (fVar != null) {
                dq0.a0 a0Var = (dq0.a0) fVar;
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = new java.util.ArrayList();
                try {
                    c75.c.d(new org.json.JSONArray(rects), new dq0.y(h0Var));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "rects: " + rects + ", e: " + e17);
                }
                com.tencent.mm.flutter.plugin.proto.u builder = com.tencent.mm.flutter.plugin.proto.v.f68094h.toBuilder();
                builder.f68090d |= 1;
                builder.f68091e = viewId;
                builder.onChanged();
                java.lang.Iterable iterable = (java.lang.Iterable) h0Var.f310123d;
                com.google.protobuf.p9 p9Var = builder.f68093g;
                if (p9Var == null) {
                    if ((builder.f68090d & 2) == 0) {
                        builder.f68092f = new java.util.ArrayList(builder.f68092f);
                        builder.f68090d |= 2;
                    }
                    com.google.protobuf.e.addAll(iterable, builder.f68092f);
                    builder.onChanged();
                } else {
                    p9Var.b(iterable);
                }
                com.tencent.mm.flutter.plugin.proto.v buildPartial = builder.buildPartial();
                if (!buildPartial.isInitialized()) {
                    throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
                }
                a0Var.n("setGestureRects", buildPartial.toByteArray(), new dq0.z(callback));
            }
        }
        return jz5.f0.f302826a;
    }
}
