package js3;

/* loaded from: classes4.dex */
public class k implements com.tencent.mm.ipcinvoker.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f301528d;

    /* renamed from: e, reason: collision with root package name */
    public long f301529e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f301530f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f301531g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f301532h = new java.util.ArrayList();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        this.f301528d = rVar;
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, 0L);
        this.f301529e = t17;
        gm0.j1.d().g(new ms3.f(t17));
        gm0.j1.d().a(14418, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.f fVar = (ms3.f) m1Var;
        if (fVar.f330991f != this.f301529e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SyncMailAddrTask", "not my scene, ignore");
            return;
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = this.f301532h;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = this.f301531g;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = this.f301530f;
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<ks3.x0> linkedList = ((ks3.o1) fVar.f330989d.f70711b.f70700a).f311728d;
            if (!linkedList.isEmpty()) {
                for (ks3.x0 x0Var : linkedList) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(ya.b.ITEM_NAME, x0Var.f311770d);
                    bundle.putString("item_addr", x0Var.f311771e);
                    arrayList3.add(bundle);
                }
            }
            java.util.LinkedList<ks3.x0> linkedList2 = ((ks3.o1) fVar.f330989d.f70711b.f70700a).f311729e;
            if (!linkedList2.isEmpty()) {
                for (ks3.x0 x0Var2 : linkedList2) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(ya.b.ITEM_NAME, x0Var2.f311770d);
                    bundle2.putString("item_addr", x0Var2.f311771e);
                    arrayList2.add(bundle2);
                }
            }
            java.util.LinkedList<ks3.x0> linkedList3 = ((ks3.o1) fVar.f330989d.f70711b.f70700a).f311730f;
            if (!linkedList3.isEmpty()) {
                for (ks3.x0 x0Var3 : linkedList3) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString(ya.b.ITEM_NAME, x0Var3.f311770d);
                    bundle3.putString("item_addr", x0Var3.f311771e);
                    arrayList.add(bundle3);
                }
            }
            com.tencent.mm.protobuf.f fVar2 = fVar.f330989d.f70711b.f70700a;
            if (((ks3.o1) fVar2).f311732h) {
                long j17 = ((ks3.o1) fVar2).f311731g;
                this.f301529e = j17;
                gm0.j1.d().g(new ms3.f(j17));
                return;
            }
        }
        android.os.Bundle bundle4 = new android.os.Bundle();
        bundle4.putInt("err_type", i17);
        bundle4.putInt("err_code", i18);
        bundle4.putString("err_msg", str);
        bundle4.putParcelableArrayList("sync_add_list", arrayList3);
        bundle4.putParcelableArrayList("sync_update_list", arrayList2);
        bundle4.putParcelableArrayList("sync_delete_list", arrayList);
        bundle4.putLong("last_sync_key", this.f301529e);
        com.tencent.mm.ipcinvoker.r rVar = this.f301528d;
        if (rVar != null) {
            rVar.a(bundle4);
        }
    }
}
