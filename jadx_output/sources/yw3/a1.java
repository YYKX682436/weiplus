package yw3;

/* loaded from: classes.dex */
public final class a1 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public static final yw3.a1 f466684a = new yw3.a1();

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("select_chatrooms")) == null) {
            str = "";
        }
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        if (!(!f07.isEmpty())) {
            f07 = null;
        }
        if (f07 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsername " + ((java.lang.String) it.next()));
            }
        }
    }
}
