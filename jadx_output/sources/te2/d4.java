package te2;

/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.d4 f417948a = new te2.d4();

    public final void a(boolean z17, int i17, java.lang.String songId, java.lang.String str) {
        kotlin.jvm.internal.o.g(songId, "songId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(songId);
        b(z17, i17, arrayList, str);
    }

    public final void b(boolean z17, int i17, java.util.ArrayList songIdList, java.lang.String str) {
        kotlin.jvm.internal.o.g(songIdList, "songIdList");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("music_id", songIdList);
        if (!(str == null || str.length() == 0)) {
            jSONObject.put("ai_msg_id", str);
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.C, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 21L, jSONObject.toString(), null, 4, null);
        }
    }

    public final void c(boolean z17, int i17, dk2.vg musicItem, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("base_listenid", musicItem.f234254a.getString(9));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z19) {
            jSONObject.put("duration", currentTimeMillis - musicItem.f234259f);
        }
        if (z18) {
            musicItem.f234259f = currentTimeMillis;
        }
        jSONObject.put("play_id", musicItem.f234259f);
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328359k2, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 67L, jSONObject.toString(), null, 4, null);
        }
    }
}
