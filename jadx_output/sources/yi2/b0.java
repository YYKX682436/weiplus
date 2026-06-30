package yi2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o71 f462496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462498h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i17, int i18, r45.o71 o71Var, yi2.i0 i0Var, java.lang.String str) {
        super(0);
        this.f462494d = i17;
        this.f462495e = i18;
        this.f462496f = o71Var;
        this.f462497g = i0Var;
        this.f462498h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.q qVar;
        if (this.f462494d == 0 && this.f462495e == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "loadRecommInfo() success - got " + (this.f462496f.getList(4).size() + this.f462496f.getList(1).size()) + " items, continueFlag=" + this.f462496f.getInteger(3));
            yi2.i0 i0Var = this.f462497g;
            i0Var.f462531t = 0;
            i0Var.f462533v = this.f462496f.getInteger(3) == 1;
            yi2.i0 i0Var2 = this.f462497g;
            java.lang.String str = null;
            if (i0Var2.f462533v) {
                com.tencent.mm.protobuf.g byteString = this.f462496f.getByteString(2);
                i0Var2.f462530s = byteString != null ? byteString.g() : null;
            } else {
                i0Var2.f462530s = null;
                com.tencent.mm.plugin.finder.live.util.z zVar = (com.tencent.mm.plugin.finder.live.util.z) ((jz5.n) i0Var2.f462529r).getValue();
                synchronized (zVar) {
                    zVar.f115754a = null;
                    zVar.f115757d = 0;
                    zVar.f115758e = new java.util.Date();
                }
            }
            yi2.i0 i0Var3 = this.f462497g;
            i0Var3.f462532u = false;
            if (!i0Var3.f462533v) {
                i0Var3.f462534w = false;
            }
            kotlin.jvm.internal.o.f(this.f462496f.getList(4), "getObjects(...)");
            int i17 = 16;
            if (!r0.isEmpty()) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "Processing " + this.f462496f.getList(4).size() + " objects from response");
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = this.f462496f.getList(4);
                kotlin.jvm.internal.o.f(list, "getObjects(...)");
                yi2.i0 i0Var4 = this.f462497g;
                r45.o71 o71Var = this.f462496f;
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                    kotlin.jvm.internal.o.d(finderObject);
                    java.lang.String string = o71Var.getString(5);
                    i0Var4.getClass();
                    r45.xn1 xn1Var = new r45.xn1();
                    com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                    if (contact == null) {
                        qVar = null;
                    } else {
                        xn1Var.set(0, contact);
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        java.lang.String headUrl = finderContact != null ? finderContact.getHeadUrl() : null;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        java.lang.String username = finderContact2 != null ? finderContact2.getUsername() : null;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        java.lang.String nickname = finderContact3 != null ? finderContact3.getNickname() : null;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = finderContact4 != null ? finderContact4.getAuthInfo() : null;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        qVar = new km2.q("", headUrl, username, nickname, 2, "", null, true, 0, authInfo, finderContact5 != null ? finderContact5.getSignature() : null, 0, 0, false, xn1Var.getString(8), false, 0L, xn1Var, false, null, (r45.ba4) xn1Var.getCustom(16), 0, 0, 0L, null, null, 0L, null, 0, 0L, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), string, null, 1072543744, 1, null);
                    }
                    if (qVar != null) {
                        i0Var4.f462524m.add(qVar);
                    }
                }
            } else {
                kotlin.jvm.internal.o.f(this.f462496f.getList(1), "getContacts(...)");
                if (!r0.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", "Processing " + this.f462496f.getList(1).size() + " contacts from response");
                    java.util.LinkedList<r45.xn1> list2 = this.f462496f.getList(1);
                    kotlin.jvm.internal.o.f(list2, "getContacts(...)");
                    yi2.i0 i0Var5 = this.f462497g;
                    r45.o71 o71Var2 = this.f462496f;
                    for (r45.xn1 xn1Var2 : list2) {
                        java.util.ArrayList arrayList = i0Var5.f462524m;
                        kotlin.jvm.internal.o.d(xn1Var2);
                        java.lang.String string2 = o71Var2.getString(5);
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        java.lang.String headUrl2 = finderContact6 != null ? finderContact6.getHeadUrl() : str;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        java.lang.String username2 = finderContact7 != null ? finderContact7.getUsername() : str;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        java.lang.String nickname2 = finderContact8 != null ? finderContact8.getNickname() : str;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact9 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        java.lang.Object authInfo2 = finderContact9 != null ? finderContact9.getAuthInfo() : str;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact10 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        arrayList.add(new km2.q("", headUrl2, username2, nickname2, 2, "", null, true, 0, authInfo2, finderContact10 != null ? finderContact10.getSignature() : str, 0, 0, false, xn1Var2.getString(8), false, 0L, xn1Var2, false, null, (r45.ba4) xn1Var2.getCustom(i17), 0, 0, 0L, null, null, 0L, null, 0, 0L, null, string2, null, 2146285568, 1, null));
                        i17 = 16;
                        str = null;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", "objects and contacts both empty ");
                }
            }
            this.f462497g.l();
        } else {
            com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", "loadRecommInfo() failed - errType=" + this.f462494d + ", errCode=" + this.f462495e + ", errMsg=" + this.f462498h + ", retry=" + this.f462497g.f462531t);
            yi2.i0 i0Var6 = this.f462497g;
            i0Var6.f462532u = false;
            int i18 = i0Var6.f462531t + 1;
            i0Var6.f462531t = i18;
            if (i18 > 3) {
                i0Var6.f462533v = false;
                i0Var6.f462534w = false;
                i0Var6.l();
            } else {
                i0Var6.L.postDelayed(new yi2.a0(i0Var6), i18 * 1000);
            }
        }
        return jz5.f0.f302826a;
    }
}
