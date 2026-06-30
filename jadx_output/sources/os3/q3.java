package os3;

/* loaded from: classes8.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.g4 f348179d;

    public q3(os3.g4 g4Var) {
        this.f348179d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.g4 g4Var = this.f348179d;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = g4Var.f348090d;
        readMailUI.f154940v.setMailId(readMailUI.f154927f.f311626a);
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI2 = g4Var.f348090d;
        ks3.b0 b0Var = readMailUI2.f154927f;
        if (b0Var != null) {
            readMailUI2.f154936r.setText(b0Var.f311628c);
            readMailUI2.f154937s.setText(readMailUI2.f154927f.f311627b);
            readMailUI2.f154938t.setEnabled(true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = readMailUI2.f154927f.f311629d.iterator();
            while (it.hasNext()) {
                android.os.Bundle bundle = (android.os.Bundle) it.next();
                ks3.u uVar = new ks3.u();
                uVar.f311750e = bundle.getString(ya.b.ITEM_NAME, "");
                uVar.f311751f = bundle.getString("item_addr", "");
                arrayList.add(uVar);
            }
            readMailUI2.f154931m.c(arrayList, true);
            java.util.Iterator it6 = readMailUI2.f154927f.f311630e.iterator();
            while (it6.hasNext()) {
                android.os.Bundle bundle2 = (android.os.Bundle) it6.next();
                ks3.u uVar2 = new ks3.u();
                uVar2.f311750e = bundle2.getString(ya.b.ITEM_NAME, "");
                uVar2.f311751f = bundle2.getString("item_addr", "");
                arrayList2.add(uVar2);
            }
            readMailUI2.f154933o.c(arrayList2, true);
            java.util.Iterator it7 = readMailUI2.f154927f.f311631f.iterator();
            while (it7.hasNext()) {
                android.os.Bundle bundle3 = (android.os.Bundle) it7.next();
                ks3.u uVar3 = new ks3.u();
                uVar3.f311750e = bundle3.getString(ya.b.ITEM_NAME, "");
                uVar3.f311751f = bundle3.getString("item_addr", "");
                arrayList3.add(uVar3);
            }
            if (arrayList3.isEmpty()) {
                readMailUI2.f154932n.setVisibility(8);
            } else {
                readMailUI2.f154932n.c(arrayList3, true);
            }
        }
        readMailUI2.f154929h.setVisibility(0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(readMailUI2.f154927f.f311626a), js3.h.class, new os3.j4(readMailUI2));
    }
}
