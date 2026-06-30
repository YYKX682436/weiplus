package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/tencent/pigeon/biz_base/WeApp_Data;", "", "appid", "", "version_type", "", "data_buffer", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "(Ljava/lang/String;Ljava/lang/Long;[BLjava/lang/String;)V", "getAppid", "()Ljava/lang/String;", "getData_buffer", "()[B", "getPath", "getVersion_type", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;[BLjava/lang/String;)Lcom/tencent/pigeon/biz_base/WeApp_Data;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WeApp_Data {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.WeApp_Data.Companion INSTANCE = new com.tencent.pigeon.biz_base.WeApp_Data.Companion(null);
    private final java.lang.String appid;
    private final byte[] data_buffer;
    private final java.lang.String path;
    private final java.lang.Long version_type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/WeApp_Data$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/WeApp_Data;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.WeApp_Data fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.Object obj = list.get(1);
            return new com.tencent.pigeon.biz_base.WeApp_Data(str, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (byte[]) list.get(2), (java.lang.String) list.get(3));
        }
    }

    public WeApp_Data() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.WeApp_Data copy$default(com.tencent.pigeon.biz_base.WeApp_Data weApp_Data, java.lang.String str, java.lang.Long l17, byte[] bArr, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = weApp_Data.appid;
        }
        if ((i17 & 2) != 0) {
            l17 = weApp_Data.version_type;
        }
        if ((i17 & 4) != 0) {
            bArr = weApp_Data.data_buffer;
        }
        if ((i17 & 8) != 0) {
            str2 = weApp_Data.path;
        }
        return weApp_Data.copy(str, l17, bArr, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppid() {
        return this.appid;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getVersion_type() {
        return this.version_type;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData_buffer() {
        return this.data_buffer;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public final com.tencent.pigeon.biz_base.WeApp_Data copy(java.lang.String appid, java.lang.Long version_type, byte[] data_buffer, java.lang.String path) {
        return new com.tencent.pigeon.biz_base.WeApp_Data(appid, version_type, data_buffer, path);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.WeApp_Data)) {
            return false;
        }
        com.tencent.pigeon.biz_base.WeApp_Data weApp_Data = (com.tencent.pigeon.biz_base.WeApp_Data) other;
        return kotlin.jvm.internal.o.b(this.appid, weApp_Data.appid) && kotlin.jvm.internal.o.b(this.version_type, weApp_Data.version_type) && kotlin.jvm.internal.o.b(this.data_buffer, weApp_Data.data_buffer) && kotlin.jvm.internal.o.b(this.path, weApp_Data.path);
    }

    public final java.lang.String getAppid() {
        return this.appid;
    }

    public final byte[] getData_buffer() {
        return this.data_buffer;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final java.lang.Long getVersion_type() {
        return this.version_type;
    }

    public int hashCode() {
        java.lang.String str = this.appid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.version_type;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        byte[] bArr = this.data_buffer;
        int hashCode3 = (hashCode2 + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str2 = this.path;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appid, this.version_type, this.data_buffer, this.path);
    }

    public java.lang.String toString() {
        return "WeApp_Data(appid=" + this.appid + ", version_type=" + this.version_type + ", data_buffer=" + java.util.Arrays.toString(this.data_buffer) + ", path=" + this.path + ')';
    }

    public WeApp_Data(java.lang.String str, java.lang.Long l17, byte[] bArr, java.lang.String str2) {
        this.appid = str;
        this.version_type = l17;
        this.data_buffer = bArr;
        this.path = str2;
    }

    public /* synthetic */ WeApp_Data(java.lang.String str, java.lang.Long l17, byte[] bArr, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : bArr, (i17 & 8) != 0 ? null : str2);
    }
}
