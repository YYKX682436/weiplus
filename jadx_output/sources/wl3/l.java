package wl3;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView f447073e;

    public l(com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView, long j17) {
        this.f447073e = musicPlayerLyricView;
        this.f447072d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447073e;
        if (musicPlayerLyricView.g()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) musicPlayerLyricView.f150831h;
            int size = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 <= size) {
                int i19 = (i18 + size) / 2;
                long j17 = ((wl3.p) arrayList.get(i19)).f447077d;
                long j18 = this.f447072d;
                if (j18 < j17) {
                    size = i19 - 1;
                } else {
                    i18 = i19 + 1;
                    if (i18 >= arrayList.size() || j18 < ((wl3.p) arrayList.get(i18)).f447077d) {
                        i17 = i19;
                        break;
                    }
                }
            }
            if (i17 != musicPlayerLyricView.E) {
                musicPlayerLyricView.E = i17;
                if (musicPlayerLyricView.F) {
                    musicPlayerLyricView.invalidate();
                } else {
                    musicPlayerLyricView.j(i17, musicPlayerLyricView.f150835o);
                }
            }
        }
    }
}
