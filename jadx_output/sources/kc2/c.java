package kc2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f306326e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f306327a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306328b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f306329c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f306330d;

    static {
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        f306326e = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页红点AI模型行为序列阈值", e42.c0.clicfg_finder_reddot_mode_action_seq_threshold, 10, false, com.tencent.mm.plugin.finder.storage.zg0.f128454d, 8, null)).intValue();
    }

    public c(java.util.ArrayList actionInfoSeq) {
        kotlin.jvm.internal.o.g(actionInfoSeq, "actionInfoSeq");
        this.f306327a = actionInfoSeq;
        this.f306328b = "FinderKaraInfoManager.ActionSeq";
        this.f306329c = jz5.h.b(kc2.b.f306323d);
    }

    public final void a(kc2.a actionInfo) {
        kotlin.jvm.internal.o.g(actionInfo, "actionInfo");
        synchronized (this.f306327a) {
            this.f306327a.add(actionInfo);
            int size = this.f306327a.size();
            int i17 = f306326e;
            if (size > i17) {
                int size2 = this.f306327a.size() - i17;
                if (((java.lang.Boolean) ((jz5.n) this.f306329c).getValue()).booleanValue()) {
                    java.lang.String str = this.f306328b;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("before drop action seq=");
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = this.f306327a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((kc2.a) it.next()).a());
                    }
                    sb6.append(kc2.l1.d(jSONArray));
                    com.tencent.mars.xlog.Log.w(str, sb6.toString());
                }
                for (int i18 = 0; i18 < size2; i18++) {
                    this.f306327a.remove(i18);
                }
                if (((java.lang.Boolean) ((jz5.n) this.f306329c).getValue()).booleanValue()) {
                    java.lang.String str2 = this.f306328b;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("after drop action seq=");
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    java.util.Iterator it6 = this.f306327a.iterator();
                    while (it6.hasNext()) {
                        jSONArray2.put(((kc2.a) it6.next()).a());
                    }
                    sb7.append(kc2.l1.d(jSONArray2));
                    com.tencent.mars.xlog.Log.w(str2, sb7.toString());
                }
            }
            this.f306330d = kz5.n0.L0(this.f306327a, f306326e);
        }
    }
}
