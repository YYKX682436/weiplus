package yk5;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f462896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462897e;

    public q(yk5.u uVar, boolean z17) {
        this.f462897e = uVar;
        this.f462896d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        yk5.u uVar = this.f462897e;
        java.lang.String[] strArr = uVar.f462905o;
        if (strArr != null && strArr.length != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : uVar.f462905o) {
                if (uVar.w(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                uVar.s(((com.tencent.mm.storage.k4) c01.d9.b().q()).W((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), uVar.f462907q, null, uVar.f462912v));
                return;
            } else {
                uVar.s(((com.tencent.mm.storage.k4) c01.d9.b().q()).D());
                return;
            }
        }
        if (uVar.f462906p == null) {
            uVar.s(((com.tencent.mm.storage.k4) c01.d9.b().q()).D());
            return;
        }
        if (!uVar.f462907q.equals("@all.chatroom.contact")) {
            uVar.s(c01.d9.b().z().b(uVar.f462906p, uVar.f462907q, null, uVar.f462912v, false, false, true));
            return;
        }
        android.database.Cursor b17 = this.f462896d ? c01.d9.b().z().b(uVar.f462906p, "@micromsg.with.all.biz.qq.com.openim", null, uVar.f462912v, false, false, false) : c01.d9.b().z().b(uVar.f462906p, "@micromsg.with.all.biz.qq.com", null, uVar.f462912v, false, false, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (b17.moveToNext()) {
            java.lang.String string = b17.getString(b17.getColumnIndex(dm.i4.COL_USERNAME));
            if (com.tencent.mm.storage.z3.R4(string)) {
                arrayList3.add(string);
            } else {
                arrayList2.add(string);
            }
        }
        if (!b17.isClosed()) {
            b17.close();
        }
        uVar.s((arrayList2.size() == 0 && arrayList3.size() == 0) ? ((com.tencent.mm.storage.k4) c01.d9.b().q()).D() : c01.d9.b().z().a(uVar.f462906p, arrayList2, null, arrayList3, uVar.f462912v));
    }
}
