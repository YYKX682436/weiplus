package rl3;

/* loaded from: classes10.dex */
public class a implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.b f397225a;

    public a(rl3.b bVar) {
        this.f397225a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        rl3.b bVar = this.f397225a;
        if (i17 == 0) {
            if (bVar.f397226a) {
                bVar.f397226a = false;
                bVar.resume();
                return;
            }
            return;
        }
        if ((i17 == 1 || i17 == 2) && bVar.i()) {
            bVar.f397226a = true;
            bVar.pause();
        }
    }
}
