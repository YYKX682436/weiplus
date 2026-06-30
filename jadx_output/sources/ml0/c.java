package ml0;

/* loaded from: classes5.dex */
public class c extends ml0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ml0.c f327186b = new ml0.c();

    @Override // ml0.b
    public boolean a() {
        if (!(com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_behavior_collect_open", "1", false, true), 1) != 0)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Kara.EventCollector", "run");
        em0.b.a();
        return true;
    }

    @Override // ml0.b
    public long b() {
        return 1800000L;
    }

    @Override // ml0.b
    public java.lang.String c() {
        return "EventCollector";
    }
}
