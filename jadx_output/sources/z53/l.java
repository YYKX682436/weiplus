package z53;

/* loaded from: classes5.dex */
public final class l implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f470257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f470258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f470259c;

    public l(yz5.p pVar, java.util.List list, java.util.HashMap hashMap) {
        this.f470257a = pVar;
        this.f470258b = list;
        this.f470259c = hashMap;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        kotlin.jvm.internal.o.d(map);
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yz5.p pVar = this.f470257a;
            java.util.List list = this.f470258b;
            if (!hasNext) {
                pVar.invoke(java.lang.Boolean.TRUE, list);
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((y53.m) ((u53.u) entry.getValue())).B) {
                com.tencent.mars.xlog.Log.e("GameLife.ConversationLogic", "invalid contact, bind conversation failed!");
                pVar.invoke(java.lang.Boolean.FALSE, list);
                return;
            }
            java.util.List<z53.i> list2 = (java.util.List) this.f470259c.get(entry.getKey());
            if (list2 != null) {
                for (z53.i iVar : list2) {
                    java.lang.Object value = entry.getValue();
                    kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.contact.GameLifeContact");
                    y53.m mVar = (y53.m) value;
                    iVar.getClass();
                    iVar.F = mVar;
                    com.tencent.mm.storage.z3 v07 = mVar.v0();
                    iVar.H = v07.g2();
                    java.lang.CharSequence charSequence = v07.J2;
                    if (charSequence == null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        java.lang.String str = iVar.H;
                        ((ke0.e) xVar).getClass();
                        charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
                    }
                    iVar.G = charSequence;
                }
            }
        }
    }
}
