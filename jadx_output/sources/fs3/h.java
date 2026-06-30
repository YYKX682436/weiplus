package fs3;

/* loaded from: classes5.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f266304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266305e;

    public h(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI, java.util.LinkedList linkedList) {
        this.f266305e = facingCreateChatRoomAllInOneUI;
        this.f266304d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266305e;
        java.util.LinkedList linkedList = facingCreateChatRoomAllInOneUI.f154773z;
        if (linkedList != null) {
            linkedList.clear();
        }
        java.util.HashMap hashMap = facingCreateChatRoomAllInOneUI.f154772y;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.LinkedList linkedList2 = this.f266304d;
        if (linkedList2 != null && linkedList2.size() > 0) {
            int size = linkedList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.yo0 yo0Var = (r45.yo0) linkedList2.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391252e)) {
                    facingCreateChatRoomAllInOneUI.f154772y.put(yo0Var.f391252e, yo0Var);
                }
            }
        }
        int size2 = facingCreateChatRoomAllInOneUI.f154770x.size();
        for (int i18 = 0; i18 < size2; i18++) {
            r45.yo0 yo0Var2 = (r45.yo0) facingCreateChatRoomAllInOneUI.f154770x.get(i18);
            if (facingCreateChatRoomAllInOneUI.f154772y.containsKey(yo0Var2.f391252e)) {
                facingCreateChatRoomAllInOneUI.f154772y.remove(yo0Var2.f391252e);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(yo0Var2.f391252e);
                sb6.append("");
            }
        }
        java.util.HashMap hashMap2 = facingCreateChatRoomAllInOneUI.f154772y;
        if (hashMap2 != null && hashMap2.size() > 0) {
            java.util.Iterator it = facingCreateChatRoomAllInOneUI.f154772y.entrySet().iterator();
            while (it.hasNext()) {
                r45.yo0 yo0Var3 = (r45.yo0) ((java.util.Map.Entry) it.next()).getValue();
                facingCreateChatRoomAllInOneUI.f154773z.add(yo0Var3);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(yo0Var3.f391252e);
                sb7.append("");
            }
        }
        facingCreateChatRoomAllInOneUI.f154770x.addAll(facingCreateChatRoomAllInOneUI.f154773z);
        facingCreateChatRoomAllInOneUI.P.sendEmptyMessage(10001);
    }
}
