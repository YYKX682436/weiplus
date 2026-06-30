package sb3;

/* loaded from: classes13.dex */
public class b implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb3.c f405434a;

    public b(sb3.c cVar) {
        this.f405434a = cVar;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        sb3.c cVar = this.f405434a;
        if (i18 == 0) {
            ((java.util.HashMap) cVar.f405437c).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        } else {
            ((java.util.HashMap) cVar.f405437c).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
        }
    }
}
