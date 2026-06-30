package zb4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f471303a;

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f471304b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f471305c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471306d;

    /* renamed from: e, reason: collision with root package name */
    public int f471307e;

    public a(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.util.Size emojiSize, java.lang.String str, java.lang.String text, int i17) {
        kotlin.jvm.internal.o.g(emojiSize, "emojiSize");
        kotlin.jvm.internal.o.g(text, "text");
        this.f471303a = iEmojiInfo;
        this.f471304b = emojiSize;
        this.f471305c = str;
        this.f471306d = text;
        this.f471307e = i17;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        int i17 = this.f471307e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return i17;
    }

    public final com.tencent.mm.api.IEmojiInfo b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f471303a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return iEmojiInfo;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = this.f471305c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = this.f471306d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public final boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTextComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        boolean z17 = this.f471307e == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTextComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return z17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return true;
        }
        if (!(obj instanceof zb4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        zb4.a aVar = (zb4.a) obj;
        if (!kotlin.jvm.internal.o.b(this.f471303a, aVar.f471303a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f471304b, aVar.f471304b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f471305c, aVar.f471305c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f471306d, aVar.f471306d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        int i17 = this.f471307e;
        int i18 = aVar.f471307e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return i17 == i18;
    }

    public final boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        int i17 = this.f471307e;
        if (i17 != 0) {
            if (i17 != 1) {
                java.lang.String str = this.f471305c;
                boolean z17 = !(str == null || str.length() == 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                return z17;
            }
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f471303a;
            if (iEmojiInfo != null) {
                kotlin.jvm.internal.o.d(iEmojiInfo);
                java.lang.String md52 = iEmojiInfo.getMd5();
                if (!(md52 == null || md52.length() == 0)) {
                    r3 = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return r3;
        }
        if (this.f471306d.length() > 0) {
            java.lang.String str2 = this.f471306d;
            int length = str2.length() - 1;
            int i18 = 0;
            boolean z18 = false;
            while (i18 <= length) {
                boolean z19 = kotlin.jvm.internal.o.i(str2.charAt(!z18 ? i18 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    }
                    length--;
                } else if (z19) {
                    i18++;
                } else {
                    z18 = true;
                }
            }
            if (!kotlin.jvm.internal.o.b(str2.subSequence(i18, length + 1).toString(), "")) {
                r3 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return r3;
    }

    public final void g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        this.f471307e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    public final void h(android.util.Size size) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        kotlin.jvm.internal.o.g(size, "<set-?>");
        this.f471304b = size;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f471303a;
        int hashCode = (((iEmojiInfo == null ? 0 : iEmojiInfo.hashCode()) * 31) + this.f471304b.hashCode()) * 31;
        java.lang.String str = this.f471305c;
        int hashCode2 = ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f471306d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f471307e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return hashCode2;
    }

    public final void i(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f471306d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = "SnsCmtPostContentData(emoji=" + this.f471303a + ", emojiSize=" + this.f471304b + ", image=" + this.f471305c + ", text=" + this.f471306d + ", contentType=" + this.f471307e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public a() {
        this(null, new android.util.Size(0, 0), null, "", 0);
    }
}
