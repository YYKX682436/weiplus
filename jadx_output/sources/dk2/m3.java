package dk2;

/* loaded from: classes3.dex */
public final class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f233750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233751d;

    public m3(dk2.r4 r4Var, android.content.Context context, yz5.l lVar, java.lang.String str) {
        this.f233748a = r4Var;
        this.f233749b = context;
        this.f233750c = lVar;
        this.f233751d = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String string;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.List list = ((mm2.x4) this.f233748a.m(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            java.lang.String str = this.f233751d;
            java.util.Iterator it = list.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (kotlin.jvm.internal.o.b(((dk2.zf) obj3).a(), str)) {
                    break;
                }
            }
            dk2.zf zfVar = (dk2.zf) obj3;
            if (zfVar == null || (string = zfVar.k()) == null) {
                java.util.ArrayList arrayList = ((mm2.f5) this.f233748a.m(mm2.f5.class)).f329024f;
                java.lang.String str2 = this.f233751d;
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it6.next();
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) obj4).getCustom(0);
                    if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, str2)) {
                        break;
                    }
                }
                r45.xn1 xn1Var = (r45.xn1) obj4;
                string = xn1Var != null ? xn1Var.getString(6) : null;
            }
            if (string == null) {
                java.util.List list2 = ((mm2.o4) this.f233748a.m(mm2.o4.class)).f329327v;
                kotlin.jvm.internal.o.f(list2, "<get-audienceLinkMicUserList>(...)");
                java.lang.String str3 = this.f233751d;
                synchronized (list2) {
                    java.util.Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) next).f309172c, str3)) {
                            obj2 = next;
                            break;
                        }
                    }
                }
                km2.q qVar = (km2.q) obj2;
                if (qVar != null) {
                    string = qVar.f309173d;
                }
            }
            dk2.xa.f234344a.a(this.f233748a.f234007b, 2, string);
            android.content.Context context = this.f233749b;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.eac));
            this.f233750c.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
