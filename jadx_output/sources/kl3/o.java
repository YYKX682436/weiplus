package kl3;

/* loaded from: classes11.dex */
public abstract class o implements kl3.e {

    /* renamed from: a, reason: collision with root package name */
    public kl3.g f308836a;

    /* renamed from: b, reason: collision with root package name */
    public b21.r f308837b;

    @Override // kl3.e
    public void a() {
        xl3.b k17 = kl3.t.k();
        k17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
        android.media.AudioManager audioManager = k17.f455117a;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocus(k17.f455118b);
    }

    @Override // kl3.e
    public void b(b21.r rVar) {
    }

    @Override // kl3.e
    public java.lang.String c(java.lang.String str) {
        return str;
    }

    @Override // kl3.e
    public b21.r d(b21.r rVar) {
        return rVar;
    }

    @Override // kl3.e
    public void e(b21.r rVar) {
    }

    @Override // kl3.e
    public void f(b21.r rVar) {
    }

    @Override // kl3.e
    public b21.r g(b21.r rVar) {
        return rVar;
    }

    @Override // kl3.e
    public void i(b21.r rVar) {
        b21.r rVar2 = this.f308837b;
        if (rVar2 == null || !rVar2.a(rVar)) {
            this.f308837b = rVar;
            return;
        }
        b21.r rVar3 = this.f308837b;
        rVar3.getClass();
        rVar3.f17348g = rVar.f17348g;
        rVar3.f17349h = rVar.f17349h;
        rVar3.f17350i = rVar.f17350i;
        rVar3.f17351m = rVar.f17351m;
        rVar3.f17355q = rVar.f17355q;
        rVar3.f17356r = rVar.f17356r;
        rVar3.f17357s = rVar.f17357s;
        rVar3.f17362x = rVar.f17362x;
        rVar3.f17358t = rVar.f17358t;
        rVar3.D = rVar.D;
        rVar3.F = rVar.F;
        rVar3.K = rVar.K;
        rVar3.L = rVar.L;
        rVar3.f17357s = rVar.f17357s;
        rVar3.S = rVar.R;
        rVar3.S = rVar.S;
        rVar3.C = rVar.C;
        rVar3.E = rVar.E;
        rVar3.I = rVar.I;
        rVar3.H = rVar.H;
        rVar3.G = rVar.G;
        rVar3.T = rVar.T;
        rVar3.U = rVar.U;
        rVar3.V = rVar.V;
        rVar3.M = rVar.M;
    }

    @Override // kl3.e
    public void init() {
    }

    @Override // kl3.e
    public boolean j(int i17) {
        return true;
    }

    @Override // kl3.e
    public void k(b21.r rVar) {
    }

    @Override // kl3.e
    public void l(b21.r rVar) {
    }

    @Override // kl3.e
    public void m(b21.r rVar) {
    }

    @Override // kl3.e
    public void n(b21.r rVar, int i17) {
    }

    @Override // kl3.e
    public b21.r o() {
        return this.f308837b;
    }

    @Override // kl3.e
    public void p(b21.r rVar) {
    }

    @Override // kl3.e
    public b21.r q(java.util.List list, int i17) {
        if (list == null || list.size() == 0 || i17 >= list.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBaseLogic", "music wrapper list error");
            return null;
        }
        this.f308837b = (b21.r) list.get(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBaseLogic", "startPlayNewMusicList:%d", java.lang.Integer.valueOf(i17));
        return this.f308837b;
    }

    @Override // kl3.e
    public void r(b21.r rVar) {
    }

    @Override // kl3.e
    public boolean requestFocus() {
        xl3.b k17 = kl3.t.k();
        android.media.AudioManager audioManager = k17.f455117a;
        if (audioManager == null) {
            return false;
        }
        int requestAudioFocus = audioManager.requestAudioFocus(k17.f455118b, 3, 2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(requestAudioFocus == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", objArr);
        return requestAudioFocus == 1;
    }

    @Override // kl3.e
    public boolean s(b21.r rVar) {
        this.f308837b = rVar;
        return true;
    }

    @Override // kl3.e
    public void t(java.util.List list, boolean z17) {
    }

    @Override // kl3.e
    public void u(b21.r rVar) {
        this.f308837b = rVar;
    }

    @Override // kl3.e
    public java.net.URL v(java.lang.String str) {
        return new java.net.URL(str);
    }

    @Override // kl3.e
    public void w(b21.r rVar) {
    }

    @Override // kl3.e
    public boolean x(int i17) {
        return false;
    }
}
