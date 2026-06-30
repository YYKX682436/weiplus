package lz2;

/* loaded from: classes14.dex */
public class u implements lz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lz2.w f322355b;

    public u(lz2.w wVar, int i17) {
        this.f322355b = wVar;
        this.f322354a = i17;
    }

    @Override // lz2.c
    public void onStart() {
    }

    @Override // lz2.c
    public void onStop() {
        lz2.w wVar = this.f322355b;
        lz2.a aVar = wVar.f322359f;
        if (aVar != null) {
            aVar.onAuthSuccess(this.f322354a, wVar.f322361h);
            wVar.f322359f = null;
        }
        wVar.f322357d.dismiss();
    }
}
