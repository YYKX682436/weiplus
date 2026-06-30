package qb2;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f361307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f361308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qb2.b0 b0Var, l75.w0 w0Var) {
        super(0);
        this.f361307d = b0Var;
        this.f361308e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qb2.b0 b0Var = this.f361307d;
        java.lang.String str = b0Var.f361167f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] convScene = ");
        sb6.append(b0Var.f361175q);
        sb6.append(",eventData.eventId = ");
        l75.w0 w0Var = this.f361308e;
        sb6.append(w0Var.f316974b);
        sb6.append(',');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i17 = w0Var.f316974b;
        if (i17 == 1 || i17 == 2) {
            java.lang.Object obj = w0Var.f316976d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
            qb2.b0.B(b0Var, (qb2.t) obj);
        } else {
            java.util.ArrayList arrayList = b0Var.f361172n;
            java.util.HashMap hashMap = b0Var.f361173o;
            if (i17 == 5) {
                java.lang.Object obj2 = w0Var.f316976d;
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.t tVar = (qb2.t) obj2;
                int i18 = tVar.field_type;
                if (i18 == 1 && b0Var.f361174p == 1) {
                    qb2.t tVar2 = (qb2.t) hashMap.get("findersayhisessionholder");
                    if (tVar2 != null) {
                        tVar2.field_unReadCount = 0;
                        tVar2.field_readStatus = 1;
                        int indexOf = arrayList.indexOf(tVar);
                        if (indexOf >= 0 && indexOf < arrayList.size()) {
                            b0Var.p(indexOf);
                        }
                    }
                } else if (i18 == 3 && b0Var.f361174p == 1) {
                    qb2.t tVar3 = (qb2.t) hashMap.get("finderaliassessionholder");
                    if (tVar3 != null) {
                        tVar3.field_unReadCount = 0;
                        tVar3.field_readStatus = 1;
                        int indexOf2 = arrayList.indexOf(tVar);
                        if (indexOf2 >= 0 && indexOf2 < arrayList.size()) {
                            b0Var.p(indexOf2);
                        }
                    }
                } else {
                    int c07 = kz5.n0.c0(arrayList, (qb2.t) hashMap.get(tVar.field_sessionId));
                    tVar.u0();
                    if (c07 >= 0 && c07 < arrayList.size()) {
                        arrayList.set(c07, tVar);
                        java.lang.String field_sessionId = tVar.field_sessionId;
                        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                        hashMap.put(field_sessionId, tVar);
                        if (c07 >= 0 && c07 < arrayList.size()) {
                            b0Var.p(c07);
                        }
                    }
                }
            } else if (i17 == 6) {
                java.lang.Object obj3 = w0Var.f316976d;
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.t tVar4 = (qb2.t) obj3;
                int c08 = kz5.n0.c0(arrayList, (qb2.t) hashMap.get(tVar4.field_sessionId));
                if (c08 >= 0 && c08 < arrayList.size()) {
                    arrayList.remove(c08);
                    hashMap.remove(tVar4.field_sessionId);
                    b0Var.w(c08);
                }
            } else if (i17 == 7) {
                java.lang.Object obj4 = w0Var.f316976d;
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.b0.B(b0Var, (qb2.t) obj4);
            }
        }
        return jz5.f0.f302826a;
    }
}
