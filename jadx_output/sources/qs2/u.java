package qs2;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f366324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Intent intent, android.content.Context context, int i17) {
        super(1);
        this.f366324d = intent;
        this.f366325e = context;
        this.f366326f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.e21 e21Var = (r45.e21) obj;
        qs2.v vVar = qs2.v.f366327a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        int i17 = this.f366326f;
        android.content.Context context = this.f366325e;
        android.content.Intent intent = this.f366324d;
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            intent.putExtra("key_topic_id", e21Var.getLong(0));
            intent.putExtra("key_activity_type", 101);
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
            intent.putExtra("key_activity_desc", string3 != null ? string3 : "");
            intent.putExtra("key_activity_end_time", e21Var.getLong(13));
            intent.putExtra("saveActivity", true);
            vVar.f(intent, context, i17);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            vVar.f(intent, context, i17);
        }
        return f0Var2;
    }
}
