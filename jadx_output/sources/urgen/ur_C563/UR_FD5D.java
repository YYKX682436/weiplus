package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0087 J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087 J\t\u0010\r\u001a\u00020\fH\u0087 ¨\u0006\u000e"}, d2 = {"Lurgen/ur_C563/UR_FD5D;", "", "<init>", "()V", "UR_8E47", "", "request", "", "callback", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_5191", "proxy", "", "UR_4D93", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_FD5D {
    public static final urgen.ur_C563.UR_FD5D INSTANCE = new urgen.ur_C563.UR_FD5D();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_FD5D() {
    }

    public static final native boolean UR_4D93();

    public static final native void UR_5191(boolean proxy);

    public static final native void UR_8E47(byte[] request, com.tencent.unit_rc.BaseObjectDef callback);
}
