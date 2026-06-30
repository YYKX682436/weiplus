package hr1;

/* loaded from: classes11.dex */
public final class a extends dm.d1 {
    public static final l75.e0 Y = dm.d1.initAutoDBInfo(hr1.a.class);

    @Override // dm.d1, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = Y;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final com.tencent.wechat.mm.biz.r5 t0() {
        byte[] field_InteractiveInfo = this.field_InteractiveInfo;
        if (field_InteractiveInfo == null) {
            return null;
        }
        kotlin.jvm.internal.o.f(field_InteractiveInfo, "field_InteractiveInfo");
        if (!(field_InteractiveInfo.length == 0)) {
            try {
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return new com.tencent.wechat.mm.biz.r5().parseFrom(this.field_InteractiveInfo);
    }

    public java.lang.String toString() {
        return "";
    }

    public final com.tencent.wechat.mm.biz.p5 u0() {
        byte[] field_userFriendInfo = this.field_userFriendInfo;
        if (field_userFriendInfo == null) {
            return null;
        }
        kotlin.jvm.internal.o.f(field_userFriendInfo, "field_userFriendInfo");
        if (!(field_userFriendInfo.length == 0)) {
            try {
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return new com.tencent.wechat.mm.biz.p5().parseFrom(this.field_userFriendInfo);
    }
}
