package hm1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.extendplugin.h {

    /* renamed from: e, reason: collision with root package name */
    public static final hm1.a f282192e = new hm1.a();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // com.tencent.mm.plugin.appbrand.extendplugin.h, eg.c
    public eg.b Ua(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        switch (type.hashCode()) {
            case -1960115589:
                if (type.equals("voiproom")) {
                    return new lf1.j();
                }
                return super.Ua(type);
            case -1190716580:
                if (type.equals("nativeView")) {
                    return new com.tencent.mm.plugin.appbrand.skyline.nativeview.t0();
                }
                return super.Ua(type);
            case 112202875:
                if (type.equals("video")) {
                    lm1.t tVar = new lm1.t();
                    hm1.m mVar = hm1.m.f282203a;
                    bg.f fVar = new bg.f(((java.lang.Boolean) ((jz5.n) hm1.m.f282216n).getValue()).booleanValue(), tVar);
                    tVar.f319359a = fVar;
                    fVar.F(new lm1.a());
                    return fVar;
                }
                return super.Ua(type);
            case 113005369:
                if (type.equals("webgl")) {
                    return new wb1.h();
                }
                return super.Ua(type);
            default:
                return super.Ua(type);
        }
    }
}
