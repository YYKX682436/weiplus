package py0;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f358978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358976e = str;
        this.f358977f = str2;
        this.f358978g = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new py0.d(this.f358976e, this.f358977f, this.f358978g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((py0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.e21 e21Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358975d;
        jz5.f0 f0Var = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String finderNickName = this.f358976e;
            kotlin.jvm.internal.o.g(finderNickName, "finderNickName");
            java.lang.String eventName = this.f358977f;
            kotlin.jvm.internal.o.g(eventName, "eventName");
            bq.p1 p1Var = new bq.p1(null, finderNickName, eventName);
            this.f358975d = 1;
            obj = rm0.h.a(p1Var, 0L, null, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedList list = ((r45.du2) obj).getList(2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (list != null && (e21Var = (r45.e21) kz5.n0.Z(list)) != null) {
            if (!(e21Var.getInteger(12) != 1)) {
                e21Var = null;
            }
            if (e21Var != null) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                long j17 = e21Var.getLong(0);
                android.content.Intent intent = this.f358978g;
                intent.putExtra("key_topic_id", j17);
                intent.putExtra("key_activity_type", 102);
                if (finderContact == null || (str = finderContact.getUsername()) == null) {
                    str = "";
                }
                intent.putExtra("key_user_name", str);
                if (finderContact == null || (str2 = finderContact.getNickname()) == null) {
                    str2 = "";
                }
                intent.putExtra("key_nick_name", str2);
                if (finderContact == null || (str3 = finderContact.getHeadUrl()) == null) {
                    str3 = "";
                }
                intent.putExtra("key_avatar_url", str3);
                java.lang.String string = e21Var.getString(5);
                if (string == null) {
                    string = "";
                }
                intent.putExtra("key_cover_url", string);
                intent.putExtra("key_activity_display_mask", e21Var.getLong(17));
                java.lang.String string2 = e21Var.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                intent.putExtra("key_activity_name", string2);
                java.lang.String string3 = e21Var.getString(3);
                if (string3 == null) {
                    string3 = "";
                }
                intent.putExtra("key_activity_desc", string3);
                intent.putExtra("key_activity_end_time", e21Var.getLong(13));
                intent.putExtra("saveActivity", true);
                if (finderContact == null || (str4 = finderContact.getNickname()) == null) {
                    str4 = "";
                }
                com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "eventInfo nickname = ".concat(str4));
                java.lang.String string4 = e21Var.getString(2);
                if (string4 == null) {
                    string4 = "";
                }
                com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "eventInfo eventname = ".concat(string4));
                java.lang.String string5 = e21Var.getString(3);
                com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "eventInfo description = ".concat(string5 != null ? string5 : ""));
                f0Var = f0Var2;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MaasBaseUILogicUIC", "activity closed or get error");
        }
        return f0Var2;
    }
}
