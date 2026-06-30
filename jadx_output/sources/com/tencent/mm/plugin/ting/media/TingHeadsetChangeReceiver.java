package com.tencent.mm.plugin.ting.media;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/ting/media/TingHeadsetChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "fl4/b", "fl4/c", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingHeadsetChangeReceiver extends android.content.BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f174688c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f174689a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f174690b;

    static {
        new fl4.b(null);
        f174688c = jz5.h.b(fl4.a.f263930d);
    }

    public /* synthetic */ TingHeadsetChangeReceiver(kotlin.jvm.internal.i iVar) {
        this();
    }

    public final void a(boolean z17) {
        java.util.Iterator it = ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) this.f174690b).getValue()).values().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService = (com.tencent.mm.plugin.ting.media.TingMediaBrowserService) ((fl4.c) it.next());
            if (z17) {
                tingMediaBrowserService.getClass();
            } else {
                b66.n h17 = tingMediaBrowserService.h();
                if (h17 != null && ((b66.q) h17).n() == bw5.pq0.Playing) {
                    b66.m.a(h17, null, 1, null);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.equals(action, "android.media.AUDIO_BECOMING_NOISY")) {
            a(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset off by ACTION_AUDIO_BECOMING_NOISY");
            this.f174689a = false;
            return;
        }
        if ((android.text.TextUtils.equals(action, "android.intent.action.HEADSET_PLUG") || android.text.TextUtils.equals(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) && intent.hasExtra("state")) {
            if (intent.getIntExtra("state", 2) == 0) {
                if (this.f174689a) {
                    a(false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset off");
                    this.f174689a = false;
                    return;
                }
                return;
            }
            if (intent.getIntExtra("state", 2) != 1 || this.f174689a) {
                return;
            }
            a(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset on");
            this.f174689a = true;
        }
    }

    private TingHeadsetChangeReceiver() {
        this.f174690b = jz5.h.b(fl4.d.f263931d);
    }
}
