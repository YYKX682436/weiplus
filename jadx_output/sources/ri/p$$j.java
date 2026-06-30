package ri;

/* loaded from: classes12.dex */
public final /* synthetic */ class p$$j implements m3.a {
    @Override // m3.a
    public final void accept(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        java.util.List list = gi.p.f272077c;
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.List list2 = (java.util.List) list.get(i17);
            for (int i18 = 0; i18 < list2.size(); i18++) {
                m3.d dVar = (m3.d) list2.get(i18);
                map.put("net-info-type-" + i17 + "-" + i18, dVar.f323092a);
                map.put("net-info-name-" + i17 + "-" + i18, dVar.f323093b);
            }
        }
    }
}
