package js3;

/* loaded from: classes4.dex */
public class j implements com.tencent.mm.ipcinvoker.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301526d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f301527e;

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchMailAddrTask", "search mail  %s", iPCString.f68406d);
        this.f301527e = rVar;
        java.lang.String str = iPCString.f68406d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f301526d = str;
        gm0.j1.d().g(new ms3.d(str));
        gm0.j1.d().a(11016, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<ks3.x0> linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.d dVar = (ms3.d) m1Var;
        dVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = dVar.f330985f;
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.equals(this.f301526d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SearchMailAddrTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11016, this);
        if (this.f301527e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("search_text", this.f301526d);
            if (i17 == 0 && i18 == 0 && (linkedList = ((ks3.j1) dVar.f330983d.f70711b.f70700a).f311702d) != null && !linkedList.isEmpty()) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                for (ks3.x0 x0Var : linkedList) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(ya.b.ITEM_NAME, x0Var.f311770d);
                    bundle2.putString("item_addr", x0Var.f311771e);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("search_addr_list", arrayList);
            }
            this.f301527e.a(bundle);
        }
    }
}
