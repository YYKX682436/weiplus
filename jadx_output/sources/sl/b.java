package sl;

/* loaded from: classes9.dex */
public class b implements tl.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.j f409019a;

    public b(sl.j jVar) {
        this.f409019a = jVar;
    }

    public void a(long j17) {
        int i17 = 0;
        while (true) {
            sl.j jVar = this.f409019a;
            if (i17 >= ((java.util.ArrayList) jVar.f409039l).size()) {
                return;
            }
            ((com.tencent.mm.ui.chatting.x0) ((com.tencent.mm.modelbase.a1) ((java.util.ArrayList) jVar.f409039l).get(i17))).f206226a.f202778x = j17;
            yd5.r.f461149c = j17;
            i17++;
        }
    }
}
