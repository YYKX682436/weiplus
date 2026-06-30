package qe2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f362053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f362055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f362056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.content.Context context, com.tencent.mm.modelbase.f fVar, java.util.List list) {
        super(0);
        this.f362053d = f4Var;
        this.f362054e = context;
        this.f362055f = fVar;
        this.f362056g = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.dm2 object_extend;
        r45.d50 d50Var;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f362053d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Context context = this.f362054e;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showFromShare: activity destroyed, skip show sheet");
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.modelbase.f fVar = this.f362055f;
        int i17 = fVar.f70615a;
        java.util.List<qe2.c> list2 = this.f362056g;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null && (contact = finderObject.getContact()) != null) {
                java.lang.String username = contact.getUsername();
                if (!(username == null || username.length() == 0)) {
                    java.lang.String username2 = contact.getUsername();
                    kotlin.jvm.internal.o.d(username2);
                    hashMap.put(username2, contact);
                }
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null && (object_extend = finderObject2.getObject_extend()) != null && (d50Var = (r45.d50) object_extend.getCustom(63)) != null && (list = d50Var.getList(1)) != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) it.next();
                    if (finderContact2 != null) {
                        java.lang.String username3 = finderContact2.getUsername();
                        if (!(username3 == null || username3.length() == 0)) {
                            java.lang.String username4 = finderContact2.getUsername();
                            kotlin.jvm.internal.o.d(username4);
                            hashMap.put(username4, finderContact2);
                        }
                    }
                }
            }
            for (qe2.c cVar : list2) {
                if (!(cVar.f362035a.length() == 0) && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) hashMap.get(cVar.f362035a)) != null) {
                    if (cVar.f362037c.length() == 0) {
                        java.lang.String headUrl = finderContact.getHeadUrl();
                        if (!(headUrl == null || headUrl.length() == 0)) {
                            java.lang.String headUrl2 = finderContact.getHeadUrl();
                            kotlin.jvm.internal.o.d(headUrl2);
                            cVar.f362037c = headUrl2;
                        }
                    }
                    if (cVar.f362036b.length() == 0) {
                        java.lang.String nickname = finderContact.getNickname();
                        if (!(nickname == null || nickname.length() == 0)) {
                            java.lang.String nickname2 = finderContact.getNickname();
                            kotlin.jvm.internal.o.d(nickname2);
                            cVar.f362036b = nickname2;
                        }
                    }
                    cVar.f362038d = finderContact.getFollowFlag() == ya2.b2.Q2;
                    if (finderContact.getAuthInfo() != null) {
                        cVar.f362039e = finderContact.getAuthInfo();
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showFromShare: CGI finished, show sheet");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showFromShare: CGI failed errType=" + fVar.f70615a + ", show sheet with fallback data");
        }
        com.tencent.mm.plugin.finder.live.widget.e0.W(new w.h(context, list2), null, false, 0, 7, null);
        com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showSheet: count=" + list2.size());
        return jz5.f0.f302826a;
    }
}
