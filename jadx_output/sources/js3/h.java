package js3;

/* loaded from: classes4.dex */
public class h implements com.tencent.mm.ipcinvoker.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301524d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f301525e;

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailTask", "read mail  %s", iPCString.f68406d);
        this.f301525e = rVar;
        java.lang.String str = iPCString.f68406d;
        this.f301524d = str;
        gm0.j1.d().g(new ms3.c(str));
        gm0.j1.d().a(11312, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailTask", "read mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.c cVar = (ms3.c) m1Var;
        if (!cVar.f330982f.equals(this.f301524d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReadMailTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11312, this);
        if (this.f301525e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f301524d);
            if (i17 == 0 && i18 == 0) {
                ks3.y0 y0Var = ((ks3.g1) cVar.f330980d.f70711b.f70700a).f311678d;
                if (y0Var != null) {
                    bundle.putString("mail_content", y0Var.f311783q);
                    java.util.LinkedList linkedList = y0Var.f311784r;
                    if (!linkedList.isEmpty()) {
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ks3.w0 w0Var = (ks3.w0) it.next();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("attach_fileId", w0Var.f311762d);
                            bundle2.putString("attach_key", w0Var.f311767i);
                            bundle2.putString("attach_name", w0Var.f311763e);
                            bundle2.putString("attach_type", w0Var.f311765g);
                            bundle2.putInt("attach_size", w0Var.f311764f);
                            bundle2.putString("attach_download_url", w0Var.f311766h);
                            arrayList.add(bundle2);
                        }
                        bundle.putParcelableArrayList("mail_normal_attach", arrayList);
                    }
                    java.util.LinkedList linkedList2 = y0Var.f311785s;
                    if (!linkedList2.isEmpty()) {
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            ks3.w0 w0Var2 = (ks3.w0) it6.next();
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            bundle3.putString("attach_fileId", w0Var2.f311762d);
                            bundle3.putString("attach_key", w0Var2.f311767i);
                            bundle3.putString("attach_name", w0Var2.f311763e);
                            bundle3.putString("attach_type", w0Var2.f311765g);
                            bundle3.putInt("attach_size", w0Var2.f311764f);
                            bundle3.putString("attach_download_url", w0Var2.f311766h);
                            arrayList2.add(bundle3);
                        }
                        bundle.putParcelableArrayList("mail_big_attach", arrayList2);
                    }
                }
                ks3.m1 m1Var2 = ((ks3.g1) cVar.f330980d.f70711b.f70700a).f311679e;
                if (m1Var2 != null) {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putLong("cookie_xmail_uin", m1Var2.f311719d);
                    bundle4.putString("cookie_xmail_skey", m1Var2.f311721f);
                    bundle4.putString("cookie_xmail_sid", m1Var2.f311720e);
                    bundle.putParcelable("mail_cookie", bundle4);
                }
            }
            this.f301525e.a(bundle);
        }
    }
}
