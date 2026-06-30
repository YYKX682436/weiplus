package com.tencent.mm.plugin.handoff.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017BY\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffMG;", "Lcom/tencent/mm/plugin/handoff/model/HandOffMP;", "", "getDataType", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "copy", "", "icon", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "appID", "appEntryPage", "appUserName", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "Landroid/os/Parcel;", ya.b.SOURCE, "(Landroid/os/Parcel;)V", "Companion", "e73/o", "api-handoff_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class HandOffMG extends com.tencent.mm.plugin.handoff.model.HandOffMP {
    public static final e73.o Companion = new e73.o(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.handoff.model.HandOffMG> CREATOR = new e73.n();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffMG(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName) {
        this(icon, title, appID, appEntryPage, appUserName, 0, null, null, null, 480, null);
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(appEntryPage, "appEntryPage");
        kotlin.jvm.internal.o.g(appUserName, "appUserName");
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOffMP, com.tencent.mm.plugin.handoff.model.HandOff
    public com.tencent.mm.plugin.handoff.model.HandOff copy() {
        com.tencent.mm.plugin.handoff.model.HandOffMG handOffMG = new com.tencent.mm.plugin.handoff.model.HandOffMG(getIcon(), getTitle(), getAppID(), getAppEntryPage(), getAppUserName(), getHandOffType(), getFrom(), getTo(), getKey());
        handOffMG.setId(getId());
        return handOffMG;
    }

    @Override // com.tencent.mm.plugin.handoff.model.HandOffMP, com.tencent.mm.plugin.handoff.model.HandOff
    public int getDataType() {
        return 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffMG(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17) {
        this(icon, title, appID, appEntryPage, appUserName, i17, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(appEntryPage, "appEntryPage");
        kotlin.jvm.internal.o.g(appUserName, "appUserName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffMG(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from) {
        this(icon, title, appID, appEntryPage, appUserName, i17, from, null, null, 384, null);
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(appEntryPage, "appEntryPage");
        kotlin.jvm.internal.o.g(appUserName, "appUserName");
        kotlin.jvm.internal.o.g(from, "from");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandOffMG(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from, java.lang.String to6) {
        this(icon, title, appID, appEntryPage, appUserName, i17, from, to6, null, 256, null);
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(appEntryPage, "appEntryPage");
        kotlin.jvm.internal.o.g(appUserName, "appUserName");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandOffMG(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from, java.lang.String to6, java.lang.String key) {
        super(icon, title, appID, appEntryPage, appUserName, i17, from, to6, key);
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(appEntryPage, "appEntryPage");
        kotlin.jvm.internal.o.g(appUserName, "appUserName");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(key, "key");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HandOffMG(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 1
            r8 = r1
            goto Lb
        L9:
            r8 = r18
        Lb:
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r19
        L15:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1b
            r10 = r2
            goto L1d
        L1b:
            r10 = r20
        L1d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2a
            e73.b r0 = com.tencent.mm.plugin.handoff.model.HandOff.Companion
            r1 = 4
            java.lang.String r0 = r0.a(r1, r8)
            r11 = r0
            goto L2c
        L2a:
            r11 = r21
        L2c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    public HandOffMG() {
        this("", "", "", "", "", 0, null, null, null, 480, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandOffMG(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }
}
