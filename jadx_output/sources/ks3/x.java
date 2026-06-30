package ks3;

/* loaded from: classes8.dex */
public class x implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.z f311769d;

    public x(ks3.z zVar) {
        this.f311769d = zVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ks3.z zVar = this.f311769d;
        java.util.LinkedList b17 = zVar.f311788b.b();
        if (b17 == null) {
            b17 = new java.util.LinkedList();
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList = bundle.getParcelableArrayList("sync_add_list");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            for (android.os.Bundle bundle2 : parcelableArrayList) {
                ks3.u uVar = new ks3.u();
                uVar.f311750e = bundle2.getString(ya.b.ITEM_NAME);
                java.lang.String string = bundle2.getString("item_addr");
                uVar.f311751f = string;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    uVar.f311749d = uVar.f311751f.hashCode();
                }
                uVar.f311753h = x51.k.a(uVar.f311750e);
                ks3.e1 e1Var = new ks3.e1(uVar);
                if (!b17.contains(e1Var)) {
                    b17.add(e1Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Plugin.MailAddrMgr", "add contact (%s,%s)", uVar.f311751f, uVar.f311750e);
                }
            }
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList2 = bundle.getParcelableArrayList("sync_update_list");
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            for (android.os.Bundle bundle3 : parcelableArrayList2) {
                ks3.u uVar2 = new ks3.u();
                uVar2.f311750e = bundle3.getString(ya.b.ITEM_NAME);
                java.lang.String string2 = bundle3.getString("item_addr");
                uVar2.f311751f = string2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    uVar2.f311749d = uVar2.f311751f.hashCode();
                }
                uVar2.f311753h = x51.k.a(uVar2.f311750e);
                ks3.e1 e1Var2 = new ks3.e1(uVar2);
                int indexOf = b17.indexOf(e1Var2);
                if (indexOf != -1) {
                    b17.set(indexOf, e1Var2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Plugin.MailAddrMgr", "update contact (%s,%s)", uVar2.f311751f, uVar2.f311750e);
                }
            }
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList3 = bundle.getParcelableArrayList("sync_delete_list");
        if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
            for (android.os.Bundle bundle4 : parcelableArrayList3) {
                ks3.u uVar3 = new ks3.u();
                uVar3.f311750e = bundle4.getString(ya.b.ITEM_NAME);
                java.lang.String string3 = bundle4.getString("item_addr");
                uVar3.f311751f = string3;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    uVar3.f311749d = uVar3.f311751f.hashCode();
                }
                uVar3.f311753h = x51.k.a(uVar3.f311750e);
                b17.remove(new ks3.e1(uVar3));
                com.tencent.mars.xlog.Log.i("MicroMsg.Plugin.MailAddrMgr", "delete contact (%s,%s)", uVar3.f311751f, uVar3.f311750e);
            }
        }
        zVar.f311788b.c(b17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, java.lang.Long.valueOf(bundle.getLong("last_sync_key")));
        zVar.f311792f = zVar.f311791e;
        com.tencent.mm.sdk.platformtools.u3.h(new ks3.w(this));
    }
}
