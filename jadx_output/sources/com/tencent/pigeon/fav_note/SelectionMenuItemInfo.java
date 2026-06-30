package com.tencent.pigeon.fav_note;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/fav_note/SelectionMenuItemInfo;", "", "menuType", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "(Ljava/lang/String;Ljava/lang/String;)V", "getMenuType", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectionMenuItemInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_note.SelectionMenuItemInfo.Companion INSTANCE = new com.tencent.pigeon.fav_note.SelectionMenuItemInfo.Companion(null);
    private final java.lang.String menuType;
    private final java.lang.String text;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_note/SelectionMenuItemInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_note/SelectionMenuItemInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_note.SelectionMenuItemInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.fav_note.SelectionMenuItemInfo((java.lang.String) list.get(0), (java.lang.String) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionMenuItemInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.fav_note.SelectionMenuItemInfo copy$default(com.tencent.pigeon.fav_note.SelectionMenuItemInfo selectionMenuItemInfo, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = selectionMenuItemInfo.menuType;
        }
        if ((i17 & 2) != 0) {
            str2 = selectionMenuItemInfo.text;
        }
        return selectionMenuItemInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMenuType() {
        return this.menuType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public final com.tencent.pigeon.fav_note.SelectionMenuItemInfo copy(java.lang.String menuType, java.lang.String text) {
        return new com.tencent.pigeon.fav_note.SelectionMenuItemInfo(menuType, text);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_note.SelectionMenuItemInfo)) {
            return false;
        }
        com.tencent.pigeon.fav_note.SelectionMenuItemInfo selectionMenuItemInfo = (com.tencent.pigeon.fav_note.SelectionMenuItemInfo) other;
        return kotlin.jvm.internal.o.b(this.menuType, selectionMenuItemInfo.menuType) && kotlin.jvm.internal.o.b(this.text, selectionMenuItemInfo.text);
    }

    public final java.lang.String getMenuType() {
        return this.menuType;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        java.lang.String str = this.menuType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.menuType, this.text);
    }

    public java.lang.String toString() {
        return "SelectionMenuItemInfo(menuType=" + this.menuType + ", text=" + this.text + ')';
    }

    public SelectionMenuItemInfo(java.lang.String str, java.lang.String str2) {
        this.menuType = str;
        this.text = str2;
    }

    public /* synthetic */ SelectionMenuItemInfo(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2);
    }
}
