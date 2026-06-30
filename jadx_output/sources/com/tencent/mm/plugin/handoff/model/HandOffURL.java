package com.tencent.mm.plugin.handoff.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0007\u0018\u0000 42\u00020\u0001:\u00015BS\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\b\b\u0002\u0010.\u001a\u00020\u0007¢\u0006\u0004\b/\u00100B\t\b\u0016¢\u0006\u0004\b/\u00101B\u0011\b\u0016\u0012\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b/\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0015J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u00066"}, d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffURL;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "", "getDataType", "newHandOff", "", "update", "", "body", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Ljz5/f0;", "writeToParcel", "copy", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "doCreateBallInfo", "Ljz5/l;", "Lr45/lr4;", "", "doCreateMultiTaskInfo", "toString", "", "other", "equals", "hashCode", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "icon", "getIcon", "setIcon", "nickname", "getNickname", "setNickname", "handOffType", "from", "to", "key", "displaySourceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", ya.b.SOURCE, "(Landroid/os/Parcel;)V", "Companion", "e73/s", "handoff-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class HandOffURL extends com.tencent.mm.plugin.handoff.model.HandOff {
    public static final java.lang.String KShareUrl = "handoff#shareUrl";
    private java.lang.String icon;
    private java.lang.String nickname;
    private java.lang.String title;
    private java.lang.String url;
    public static final e73.s Companion = new e73.s(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.handoff.model.HandOffURL> CREATOR = new e73.r();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon) {
        this(title, url, icon, 0, null, null, null, null, 248, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public java.lang.String body() {
        return r26.b0.b("\n        <title>" + e73.j.a(this.title) + "</title>\n        <url>" + e73.j.a(this.url) + "</url>\n        <icon>" + e73.j.a(this.icon) + "</icon>\n    ");
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public com.tencent.mm.plugin.handoff.model.HandOff copy() {
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = new com.tencent.mm.plugin.handoff.model.HandOffURL(this.title, this.url, this.icon, getHandOffType(), getFrom(), getTo(), getKey(), getDisplaySourceName());
        handOffURL.setId(getId());
        return handOffURL;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public com.tencent.mm.plugin.ball.model.BallInfo doCreateBallInfo() {
        if (getHandOffType() == 1) {
            return null;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(2, getKey(), null);
        ballInfo.f93063x = this.title;
        ballInfo.f93057r = this.icon;
        ballInfo.n("rawUrl", this.url);
        ballInfo.f93048f = 1;
        return ballInfo;
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public jz5.l doCreateMultiTaskInfo() {
        if (getHandOffType() == 1) {
            return null;
        }
        r45.lr4 lr4Var = new r45.lr4();
        r45.k97 k97Var = new r45.k97();
        lr4Var.set(1, this.title);
        lr4Var.set(5, this.icon);
        lr4Var.set(0, getDisplaySourceName());
        k97Var.set(2, this.url);
        k97Var.set(1, this.url);
        return new jz5.l(lr4Var, k97Var.toByteArray());
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.mm.plugin.handoff.model.HandOffURL) || !super.equals(other)) {
            return false;
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = (com.tencent.mm.plugin.handoff.model.HandOffURL) other;
        return kotlin.jvm.internal.o.b(this.title, handOffURL.title) && kotlin.jvm.internal.o.b(this.url, handOffURL.url) && kotlin.jvm.internal.o.b(this.icon, handOffURL.icon) && kotlin.jvm.internal.o.b(this.nickname, handOffURL.nickname);
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public int getDataType() {
        return 2;
    }

    public final java.lang.String getIcon() {
        return this.icon;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.nickname.hashCode();
    }

    public final void setIcon(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.icon = str;
    }

    public final void setNickname(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.nickname = str;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.url = str;
    }

    public java.lang.String toString() {
        return "HandOffURL(key='" + getKey() + "', id='" + getId() + "', createTime='" + getCreateTime() + ", title='" + this.title + "', url='" + this.url + "', icon='" + this.icon + "')";
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff
    public boolean update(com.tencent.mm.plugin.handoff.model.HandOff newHandOff) {
        kotlin.jvm.internal.o.g(newHandOff, "newHandOff");
        boolean update = super.update(newHandOff);
        if (!(newHandOff instanceof com.tencent.mm.plugin.handoff.model.HandOffURL) || kotlin.jvm.internal.o.b(newHandOff, this)) {
            return update;
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = (com.tencent.mm.plugin.handoff.model.HandOffURL) newHandOff;
        if (handOffURL.title.length() > 0) {
            this.title = handOffURL.title;
        }
        if (handOffURL.url.length() > 0) {
            this.url = handOffURL.url;
        }
        if (handOffURL.icon.length() > 0) {
            this.icon = handOffURL.icon;
        }
        if (handOffURL.nickname.length() > 0) {
            this.nickname = handOffURL.nickname;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOff, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeString(this.title);
        dest.writeString(this.url);
        dest.writeString(this.icon);
        dest.writeString(this.nickname);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon, int i17) {
        this(title, url, icon, i17, null, null, null, null, 240, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon, int i17, java.lang.String from) {
        this(title, url, icon, i17, from, null, null, null, 224, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(from, "from");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon, int i17, java.lang.String from, java.lang.String to6) {
        this(title, url, icon, i17, from, to6, null, null, 192, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon, int i17, java.lang.String from, java.lang.String to6, java.lang.String key) {
        this(title, url, icon, i17, from, to6, key, null, 128, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(key, "key");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandOffURL(java.lang.String title, java.lang.String url, java.lang.String icon, int i17, java.lang.String from, java.lang.String to6, java.lang.String key, java.lang.String displaySourceName) {
        super(i17, from, to6, key, null, 0L, displaySourceName, 48, null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(displaySourceName, "displaySourceName");
        this.nickname = "";
        this.title = title;
        this.url = url;
        this.icon = icon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HandOffURL(java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.i r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 1
            r6 = r1
            goto La
        L9:
            r6 = r15
        La:
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto L12
            r7 = r2
            goto L14
        L12:
            r7 = r16
        L14:
            r1 = r0 & 32
            if (r1 == 0) goto L1a
            r8 = r2
            goto L1c
        L1a:
            r8 = r17
        L1c:
            r1 = r0 & 64
            if (r1 == 0) goto L29
            e73.b r1 = com.tencent.mm.plugin.handoff.model.HandOff.Companion
            r3 = 2
            java.lang.String r1 = r1.a(r3, r6)
            r9 = r1
            goto L2b
        L29:
            r9 = r18
        L2b:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L31
            r10 = r2
            goto L33
        L31:
            r10 = r19
        L33:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.handoff.model.HandOffURL.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    public HandOffURL() {
        this("", "", "", 0, null, null, null, null, 248, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandOffURL(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
        this.nickname = "";
        java.lang.String readString = source.readString();
        kotlin.jvm.internal.o.d(readString);
        this.title = readString;
        java.lang.String readString2 = source.readString();
        kotlin.jvm.internal.o.d(readString2);
        this.url = readString2;
        java.lang.String readString3 = source.readString();
        kotlin.jvm.internal.o.d(readString3);
        this.icon = readString3;
        java.lang.String readString4 = source.readString();
        kotlin.jvm.internal.o.d(readString4);
        this.nickname = readString4;
    }
}
