package hr;

/* loaded from: classes8.dex */
public final class c extends com.tencent.mm.ipcinvoker.wx_extension.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.ve3 request) {
        super(request, new r45.we3());
        kotlin.jvm.internal.o.g(request, "request");
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return 411;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return "MicroMsg.CgiGetEmotionList";
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return "/cgi-bin/micromsg-bin/getemotionlist";
    }
}
