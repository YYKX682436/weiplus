package v22;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final v22.j f432824a = new v22.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f432825b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final fp0.o f432826c;

    /* renamed from: d, reason: collision with root package name */
    public static final yz5.a f432827d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f432828e;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(20, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiMix"));
        f432826c = oVar;
        f432827d = v22.i.f432823d;
        f432828e = java.util.Collections.synchronizedList(new java.util.LinkedList());
        oVar.g(new v22.h());
    }

    public final v22.g a(int i17, long j17, java.lang.String videoPath, v22.a retriever, int i18, boolean z17, t85.j jVar, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(retriever, "retriever");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(rr.s.f399149a.c() + "/temp/");
        sb7.append("capture_emoji/");
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.vfs.w6.u(sb8);
        sb6.append(sb8);
        sb6.append("temp_gif");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        v22.g gVar = new v22.g(i17, j17, videoPath, sb6.toString(), retriever, i18, z17, jVar, !t22.o.f415101b, emojiInfo);
        f432828e.add(gVar);
        f432826c.a(new v22.m(gVar));
        f432825b.add(gVar);
        final yz5.a aVar = f432827d;
        com.tencent.mm.sdk.platformtools.u3.l(new java.lang.Runnable(aVar) { // from class: v22.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f432829d;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f432829d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f432829d.invoke();
            }
        });
        j45.l.A(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService.class));
        return gVar;
    }
}
