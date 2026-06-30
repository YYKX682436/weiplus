package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f214870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f214871b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f214872c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f214873d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f214874e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f214875f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.xweb.i f214876g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.thumbplayer.api.ITPPlayer f214877h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.xwebutil.p f214878i;

    /* renamed from: j, reason: collision with root package name */
    public final fp.e f214879j;

    /* renamed from: k, reason: collision with root package name */
    public final fp.c f214880k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.ref.WeakReference f214881l;

    /* renamed from: m, reason: collision with root package name */
    public final android.webkit.ValueCallback f214882m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f214883n;

    public r(com.tencent.mm.ui.MMActivity mMActivity, android.widget.RelativeLayout relativeLayout, android.view.View view, android.widget.RelativeLayout relativeLayout2, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, long j19, com.tencent.xweb.i iVar, com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.mm.xwebutil.p pVar, fp.e eVar, fp.c cVar, android.content.BroadcastReceiver broadcastReceiver, android.webkit.ValueCallback valueCallback) {
        this.f214870a = new java.lang.ref.WeakReference(mMActivity);
        new java.lang.ref.WeakReference(relativeLayout);
        new java.lang.ref.WeakReference(view);
        new java.lang.ref.WeakReference(relativeLayout2);
        this.f214871b = new java.lang.ref.WeakReference(weImageView);
        this.f214872c = new java.lang.ref.WeakReference(xWebAudioPlayerProgress);
        this.f214873d = str;
        this.f214874e = str3;
        this.f214875f = str4;
        this.f214876g = iVar;
        this.f214877h = iTPPlayer;
        this.f214878i = pVar;
        this.f214879j = eVar;
        this.f214880k = cVar;
        this.f214881l = new java.lang.ref.WeakReference(broadcastReceiver);
        this.f214882m = valueCallback;
        this.f214883n = false;
    }

    public com.tencent.mm.ui.MMActivity a() {
        java.lang.ref.WeakReference weakReference = this.f214870a;
        if (weakReference == null) {
            return null;
        }
        return (com.tencent.mm.ui.MMActivity) weakReference.get();
    }

    public com.tencent.mm.xwebutil.XWebAudioPlayerProgress b() {
        java.lang.ref.WeakReference weakReference = this.f214872c;
        if (weakReference == null) {
            return null;
        }
        return (com.tencent.mm.xwebutil.XWebAudioPlayerProgress) weakReference.get();
    }
}
