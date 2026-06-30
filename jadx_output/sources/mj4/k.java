package mj4;

/* loaded from: classes11.dex */
public final class k implements mj4.h {

    /* renamed from: b, reason: collision with root package name */
    public final mj4.a f327067b;

    /* renamed from: c, reason: collision with root package name */
    public pj4.z f327068c;

    /* renamed from: d, reason: collision with root package name */
    public int f327069d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f327070e;

    /* renamed from: f, reason: collision with root package name */
    public int f327071f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.r f327072g;

    /* renamed from: h, reason: collision with root package name */
    public int f327073h;

    /* renamed from: i, reason: collision with root package name */
    public pj4.o0 f327074i;

    /* renamed from: j, reason: collision with root package name */
    public int f327075j;

    public k(mj4.a baseData) {
        kotlin.jvm.internal.o.g(baseData, "baseData");
        this.f327067b = baseData;
    }

    public java.lang.String c() {
        return bk4.i.a().K() ? java.lang.String.valueOf((int) (c01.id.f(this.f327067b.field_CreateTime) / 3600)) : mj4.d.b(xe0.j0.a(this, false, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r26.n0.N(i())) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if ((r26.n0.N(j())) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(java.lang.String r4, pj4.b0 r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "newStatusId"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "newInfo"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = r3.l()
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L18
            r4 = 7
            return r4
        L18:
            r4 = 1
            r0 = 0
            if (r6 == 0) goto L2b
            java.lang.String r1 = r3.i()
            boolean r1 = r26.n0.N(r1)
            if (r1 == 0) goto L28
            r1 = r4
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 == 0) goto L2d
        L2b:
            if (r6 != 0) goto L2f
        L2d:
            r1 = r4
            goto L30
        L2f:
            r1 = r0
        L30:
            if (r1 == 0) goto L40
            java.lang.String r1 = r3.i()
            java.lang.String r2 = r5.f354978m
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L40
            r1 = r4
            goto L41
        L40:
            r1 = r0
        L41:
            if (r6 == 0) goto L52
            java.lang.String r2 = r3.j()
            boolean r2 = r26.n0.N(r2)
            if (r2 == 0) goto L4f
            r2 = r4
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 == 0) goto L56
        L52:
            if (r6 != 0) goto L55
            goto L56
        L55:
            r4 = r0
        L56:
            if (r4 == 0) goto L68
            java.lang.String r4 = r3.j()
            java.lang.String r5 = r5.f354976h
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L68
            r4 = r1 | 2
            r1 = r4 | 4
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mj4.k.d(java.lang.String, pj4.b0, boolean):int");
    }

    public pj4.z e() {
        mj4.a aVar = this.f327067b;
        byte[] bArr = aVar.field_EmojiInfo;
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (this.f327069d == bArr.hashCode()) {
            pj4.z zVar = this.f327068c;
            return zVar == null ? new pj4.z() : zVar;
        }
        pj4.z zVar2 = new pj4.z();
        byte[] bArr2 = aVar.field_EmojiInfo;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        zVar2.parseFrom(bArr2);
        this.f327069d = bArr2.hashCode();
        this.f327068c = zVar2;
        return zVar2;
    }

    public java.lang.String f() {
        java.lang.String str = this.f327067b.field_City;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f327067b.field_Description;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f327067b.field_IconID;
        return str == null ? "" : str;
    }

    public java.lang.String i() {
        java.lang.String str = this.f327067b.field_MediaThumbUrl;
        return str == null ? "" : str;
    }

    public java.lang.String j() {
        java.lang.String str = this.f327067b.field_MediaUrl;
        return str == null ? "" : str;
    }

    public java.lang.String k() {
        java.lang.String str = this.f327067b.field_PoiName;
        return str == null ? "" : str;
    }

    public java.lang.String l() {
        java.lang.String str = this.f327067b.field_StatusID;
        return str == null ? "" : str;
    }

    public java.lang.String m() {
        java.lang.String str = this.f327067b.field_TopicId;
        return str == null ? "" : str;
    }

    public byte[] n() {
        byte[] bArr = this.f327067b.field_TopicInfo;
        return bArr == null ? new byte[0] : bArr;
    }

    public java.lang.String o() {
        java.lang.String str = this.f327067b.field_UserName;
        return str == null ? "" : str;
    }

    public java.lang.String p() {
        java.lang.String str = this.f327067b.field_backgroundId;
        return str == null ? "" : str;
    }

    public long q() {
        java.lang.Long l17 = this.f327067b.field_option;
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public byte[] r() {
        byte[] bArr = this.f327067b.field_statusExtInfoOriBytes;
        return bArr == null ? new byte[0] : bArr;
    }

    public long s() {
        java.lang.Long l17 = this.f327067b.field_option;
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public pj4.r t() {
        byte[] bArr = this.f327067b.field_PrivateInfo;
        if (this.f327072g != null && bArr != null && this.f327073h == bArr.hashCode()) {
            return this.f327072g;
        }
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                com.tencent.mm.protobuf.f parseFrom = new pj4.r().parseFrom(bArr);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                this.f327072g = (pj4.r) parseFrom;
                this.f327073h = bArr.hashCode();
            }
        }
        return this.f327072g;
    }

    public java.lang.String toString() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ TSItem() username:");
        sb6.append(o());
        sb6.append(", statusId:");
        sb6.append(l());
        sb6.append(" ,TopicId:");
        sb6.append(m());
        sb6.append(",sourceId:");
        mj4.a aVar = this.f327067b;
        java.lang.String str = aVar.field_SourceID;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",IconID:");
        sb6.append(h());
        sb6.append(",MediaType:");
        sb6.append(aVar.field_MediaType);
        sb6.append(",mediaUrl:");
        sb6.append(j());
        sb6.append(",thumb:");
        sb6.append(i());
        sb6.append("state:");
        sb6.append(aVar.field_state);
        sb6.append(",bid:");
        sb6.append(p());
        sb6.append(",likeCont:");
        sb6.append(aVar.field_LikeCount);
        sb6.append(",CommentCont:");
        sb6.append(aVar.field_CommentCount);
        sb6.append(",mwidth");
        sb6.append(aVar.field_mediaWidth);
        sb6.append(",mheight");
        sb6.append(aVar.field_mediaHeight);
        sb6.append(",etime:");
        sb6.append(aVar.field_ExpireTime);
        sb6.append(", contentScore:");
        sb6.append(aVar.field_contentScore);
        sb6.append(", isLocal=");
        sb6.append(y());
        sb6.append(", visibility=");
        sb6.append(aVar.field_Visibility);
        sb6.append(", whiteListCount:");
        pj4.r t17 = t();
        java.lang.Integer num = null;
        sb6.append((t17 == null || (linkedList2 = t17.f355271g) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        sb6.append(", whiteUserCount:");
        pj4.r t18 = t();
        if (t18 != null && (linkedList = t18.f355270f) != null) {
            num = java.lang.Integer.valueOf(linkedList.size());
        }
        sb6.append(num);
        sb6.append("]\n");
        return sb6.toString();
    }

    public pj4.o0 u(boolean z17) {
        if (!z17) {
            if (this.f327075j == n().hashCode()) {
                pj4.o0 o0Var = this.f327074i;
                return o0Var == null ? new pj4.o0() : o0Var;
            }
        }
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] n17 = n();
        o0Var2.parseFrom(n17);
        this.f327075j = n17.hashCode();
        this.f327074i = o0Var2;
        return o0Var2;
    }

    public boolean v() {
        return (s() & 1) != 0;
    }

    public boolean w() {
        return this.f327067b.t0();
    }

    public boolean x() {
        return (s() & 128) != 0;
    }

    public boolean y() {
        return (l().length() == 0) || this.f327067b.f327055o2;
    }

    public boolean z() {
        int i17 = this.f327067b.field_state;
        mj4.h.f327064a.getClass();
        return i17 == mj4.g.f327063c;
    }
}
