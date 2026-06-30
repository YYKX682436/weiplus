package urgen.ur_7522;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 JC\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087 ¨\u0006\u0015"}, d2 = {"Lurgen/ur_7522/UR_5358;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_BA14", "", "ptr", "", "ecs_jump_info", "", "chat_type", "", "chat_user_name", "", "chat_sex", "version", "callback", "UR_1542", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_5358 {
    public static final urgen.ur_7522.UR_5358 INSTANCE = new urgen.ur_7522.UR_5358();

    private UR_5358() {
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native byte[] UR_1542(long ptr, java.lang.String chat_user_name);

    public static final native void UR_BA14(long ptr, byte[] ecs_jump_info, int chat_type, java.lang.String chat_user_name, int chat_sex, int version, com.tencent.unit_rc.BaseObjectDef callback);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new x02.g();
    }
}
