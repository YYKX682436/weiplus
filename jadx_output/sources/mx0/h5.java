package mx0;

/* loaded from: classes.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ol0 f332026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(r45.ol0 ol0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332026e = ol0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.h5(this.f332026e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332025d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.ol0 ol0Var = this.f332026e;
            java.lang.String event_name = ol0Var.f382339e;
            kotlin.jvm.internal.o.f(event_name, "event_name");
            java.lang.String creator_nickname = ol0Var.f382338d;
            kotlin.jvm.internal.o.f(creator_nickname, "creator_nickname");
            this.f332025d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new us2.v(creator_nickname, event_name, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.e21 e21Var = (r45.e21) obj;
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            android.os.Bundle bundle = ut3.f.f431176c.f431178b;
            bundle.putLong("key_topic_id", e21Var.getLong(0));
            bundle.putInt("key_activity_type", 102);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            bundle.putString("key_user_name", str);
            if (finderContact == null || (str2 = finderContact.getNickname()) == null) {
                str2 = "";
            }
            bundle.putString("key_nick_name", str2);
            if (finderContact == null || (str3 = finderContact.getHeadUrl()) == null) {
                str3 = "";
            }
            bundle.putString("key_avatar_url", str3);
            java.lang.String string = e21Var.getString(5);
            if (string == null) {
                string = "";
            }
            bundle.putString("key_cover_url", string);
            bundle.putLong("key_activity_display_mask", e21Var.getLong(17));
            java.lang.String string2 = e21Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            bundle.putString("key_activity_name", string2);
            java.lang.String string3 = e21Var.getString(3);
            if (string3 == null) {
                string3 = "";
            }
            bundle.putString("key_activity_desc", string3);
            bundle.putLong("key_activity_end_time", e21Var.getLong(13));
            bundle.putBoolean("saveActivity", true);
            if (finderContact == null || (str4 = finderContact.getNickname()) == null) {
                str4 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo nickname = ".concat(str4));
            java.lang.String string4 = e21Var.getString(2);
            if (string4 == null) {
                string4 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo eventname = ".concat(string4));
            java.lang.String string5 = e21Var.getString(3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo description = ".concat(string5 != null ? string5 : ""));
        }
        return jz5.f0.f302826a;
    }
}
