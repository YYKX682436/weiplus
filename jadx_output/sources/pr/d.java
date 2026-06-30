package pr;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f357697a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f357698b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f357699c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f357700d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.e5 f357701e;

    public d(int i17, yz5.l lVar) {
        this.f357697a = i17;
        this.f357698b = lVar;
        this.f357701e = com.tencent.mm.storage.d5.f193836a.a(i17);
    }

    public static final void a(pr.d dVar) {
        z85.b bVar;
        java.lang.Object obj;
        dVar.getClass();
        com.tencent.mm.storage.e5 e5Var = new com.tencent.mm.storage.e5();
        int i17 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        int i18 = dVar.f357697a;
        e5Var.f193857a = i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish: ");
        sb6.append(i18);
        sb6.append(", ");
        java.util.LinkedList<java.lang.String> linkedList = dVar.f357700d;
        sb6.append(linkedList.size());
        sb6.append(", oldSize ");
        com.tencent.mm.storage.e5 e5Var2 = dVar.f357701e;
        sb6.append(e5Var2.f193858b.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerTask", sb6.toString());
        boolean z17 = false;
        for (java.lang.String str : linkedList) {
            z85.a aVar = new z85.a();
            aVar.field_designerUin = i18;
            aVar.field_productId = str;
            aVar.field_syncTime = 0;
            java.util.LinkedList linkedList2 = e5Var2.f193858b;
            if (!linkedList2.isEmpty()) {
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((z85.a) obj).field_productId, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                z85.a aVar2 = (z85.a) obj;
                if (aVar2 == null) {
                    aVar.field_syncTime = i17;
                } else {
                    aVar.field_syncTime = aVar2.field_syncTime;
                    e5Var.f193858b.add(aVar);
                }
            }
            z17 = true;
            e5Var.f193858b.add(aVar);
        }
        if (z17) {
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                bVar = f17.f195177o;
            }
            bVar.y0(e5Var);
            com.tencent.mm.storage.d5.f193837b.put(java.lang.Integer.valueOf(i18), e5Var);
            new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        }
        yz5.l lVar = dVar.f357698b;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }

    public final void b() {
        new gr.f(this.f357697a, this.f357699c, false, 4, null).l().K(new pr.c(this));
    }
}
