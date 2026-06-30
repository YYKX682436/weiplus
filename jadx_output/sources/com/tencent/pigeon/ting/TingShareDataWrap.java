package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/ting/TingShareDataWrap;", "", "tingItemData", "", "categoryItemData", "commentInfoData", "([B[B[B)V", "getCategoryItemData", "()[B", "getCommentInfoData", "getTingItemData", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingShareDataWrap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingShareDataWrap.Companion INSTANCE = new com.tencent.pigeon.ting.TingShareDataWrap.Companion(null);
    private final byte[] categoryItemData;
    private final byte[] commentInfoData;
    private final byte[] tingItemData;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingShareDataWrap$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingShareDataWrap;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingShareDataWrap fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.TingShareDataWrap((byte[]) list.get(0), (byte[]) list.get(1), (byte[]) list.get(2));
        }
    }

    public TingShareDataWrap() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingShareDataWrap copy$default(com.tencent.pigeon.ting.TingShareDataWrap tingShareDataWrap, byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = tingShareDataWrap.tingItemData;
        }
        if ((i17 & 2) != 0) {
            bArr2 = tingShareDataWrap.categoryItemData;
        }
        if ((i17 & 4) != 0) {
            bArr3 = tingShareDataWrap.commentInfoData;
        }
        return tingShareDataWrap.copy(bArr, bArr2, bArr3);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getTingItemData() {
        return this.tingItemData;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getCategoryItemData() {
        return this.categoryItemData;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getCommentInfoData() {
        return this.commentInfoData;
    }

    public final com.tencent.pigeon.ting.TingShareDataWrap copy(byte[] tingItemData, byte[] categoryItemData, byte[] commentInfoData) {
        return new com.tencent.pigeon.ting.TingShareDataWrap(tingItemData, categoryItemData, commentInfoData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingShareDataWrap)) {
            return false;
        }
        com.tencent.pigeon.ting.TingShareDataWrap tingShareDataWrap = (com.tencent.pigeon.ting.TingShareDataWrap) other;
        return kotlin.jvm.internal.o.b(this.tingItemData, tingShareDataWrap.tingItemData) && kotlin.jvm.internal.o.b(this.categoryItemData, tingShareDataWrap.categoryItemData) && kotlin.jvm.internal.o.b(this.commentInfoData, tingShareDataWrap.commentInfoData);
    }

    public final byte[] getCategoryItemData() {
        return this.categoryItemData;
    }

    public final byte[] getCommentInfoData() {
        return this.commentInfoData;
    }

    public final byte[] getTingItemData() {
        return this.tingItemData;
    }

    public int hashCode() {
        byte[] bArr = this.tingItemData;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        byte[] bArr2 = this.categoryItemData;
        int hashCode2 = (hashCode + (bArr2 == null ? 0 : java.util.Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.commentInfoData;
        return hashCode2 + (bArr3 != null ? java.util.Arrays.hashCode(bArr3) : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.tingItemData, this.categoryItemData, this.commentInfoData);
    }

    public java.lang.String toString() {
        return "TingShareDataWrap(tingItemData=" + java.util.Arrays.toString(this.tingItemData) + ", categoryItemData=" + java.util.Arrays.toString(this.categoryItemData) + ", commentInfoData=" + java.util.Arrays.toString(this.commentInfoData) + ')';
    }

    public TingShareDataWrap(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.tingItemData = bArr;
        this.categoryItemData = bArr2;
        this.commentInfoData = bArr3;
    }

    public /* synthetic */ TingShareDataWrap(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : bArr, (i17 & 2) != 0 ? null : bArr2, (i17 & 4) != 0 ? null : bArr3);
    }
}
