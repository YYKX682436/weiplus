package ya2;

/* loaded from: classes10.dex */
public final class b2 extends dm.z3 implements zy2.dc, java.lang.Cloneable {
    public boolean G2;
    public int H2;
    public java.lang.String I2;
    public boolean J2;
    public int K2;
    public r45.ub1 L2;
    public java.lang.String M2;
    public java.lang.String N2;
    public static final l75.e0 O2 = dm.z3.initAutoDBInfo(ya2.b2.class);
    public static final int P2 = 2;
    public static final int Q2 = 1;
    public static final int R2 = -265713450;
    public static final int S2 = 70690926;
    public static final int T2 = -428646058;
    public static final int U2 = 351608024;
    public static final int V2 = -882710593;
    public static final int W2 = 1073584312;
    public static final int X2 = 1595250522;
    public static final int Y2 = -826755845;
    public static final int Z2 = -2027044322;

    /* renamed from: a3, reason: collision with root package name */
    public static final int f460433a3 = -351789940;

    /* renamed from: b3, reason: collision with root package name */
    public static final int f460434b3 = 293230747;

    /* renamed from: c3, reason: collision with root package name */
    public static final int f460435c3 = 1431937654;

    /* renamed from: d3, reason: collision with root package name */
    public static final int f460436d3 = -1306498449;

    /* renamed from: e3, reason: collision with root package name */
    public static final int f460437e3 = 2137566429;

    /* renamed from: f3, reason: collision with root package name */
    public static final int f460438f3 = 2137657887;

    /* renamed from: g3, reason: collision with root package name */
    public static final int f460439g3 = -1306589907;

    /* renamed from: h3, reason: collision with root package name */
    public static final int f460440h3 = -295931082;

    /* renamed from: i3, reason: collision with root package name */
    public static final int f460441i3 = -1163811001;

    /* renamed from: j3, reason: collision with root package name */
    public static final int f460442j3 = -110338125;

    /* renamed from: k3, reason: collision with root package name */
    public static final int f460443k3 = 1484490136;

    /* renamed from: l3, reason: collision with root package name */
    public static final int f460444l3 = 870321150;

    /* renamed from: m3, reason: collision with root package name */
    public static final int f460445m3 = -886171617;

    /* renamed from: n3, reason: collision with root package name */
    public static final int f460446n3 = -858047904;

    /* renamed from: o3, reason: collision with root package name */
    public static final int f460447o3 = -914110772;

    /* renamed from: p3, reason: collision with root package name */
    public static final int f460448p3 = 981051588;

    /* renamed from: q3, reason: collision with root package name */
    public static final int f460449q3 = -525049583;

    /* renamed from: r3, reason: collision with root package name */
    public static final int f460450r3 = -2069988553;

    /* renamed from: s3, reason: collision with root package name */
    public static final int f460451s3 = 1009690709;

    /* renamed from: t3, reason: collision with root package name */
    public static final int f460452t3 = 1043196382;

    /* renamed from: u3, reason: collision with root package name */
    public static final int f460453u3 = -1669771759;

    /* renamed from: v3, reason: collision with root package name */
    public static final int f460454v3 = -896505829;

    /* renamed from: w3, reason: collision with root package name */
    public static final int f460455w3 = -1220540395;

    /* renamed from: x3, reason: collision with root package name */
    public static final int f460456x3 = 1683851177;

    /* renamed from: y3, reason: collision with root package name */
    public static final int f460457y3 = 952905519;

    /* renamed from: z3, reason: collision with root package name */
    public static final int f460458z3 = -295787145;
    public static final int A3 = 100947691;
    public static final int B3 = 339324311;
    public static final int C3 = -192250423;
    public static final int D3 = -888513882;
    public static final int E3 = 108705909;
    public static final int F3 = -351778248;
    public static final int G3 = 1219723417;
    public static final int H3 = -779346762;
    public static final int I3 = -1010010610;
    public static final int J3 = 733727930;
    public static final java.lang.Class[] K3 = {r45.za1.class, r45.aw0.class, r45.l6.class, r45.m36.class, r45.zl1.class, r45.yn2.class, r45.hz0.class, com.tencent.mm.protocal.protobuf.FinderAuthInfo.class, r45.sc1.class};
    public static final java.util.Map L3 = kz5.c1.k(new jz5.l("authInfo", com.tencent.mm.protocal.protobuf.FinderAuthInfo.class), new jz5.l("extInfo", r45.hz0.class), new jz5.l("originalInfo", r45.yn2.class), new jz5.l("badgeInfoList", r45.aw0.class), new jz5.l("settlementInfo", r45.m36.class), new jz5.l("agencyCollaborateInfo", r45.l6.class), new jz5.l("bindInfoList", r45.aw0.class), new jz5.l("guestInfo", r45.za1.class), new jz5.l("jumpInfoList", r45.sc1.class));

    public b2(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.G2 = true;
        this.H2 = this.field_follow_Flag;
        this.I2 = this.field_avatarUrl;
        this.M2 = "";
        this.N2 = "";
        this.field_username = username;
    }

    public static /* synthetic */ com.tencent.mm.storage.z3 Q0(ya2.b2 b2Var, com.tencent.mm.storage.z3 z3Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z3Var = new com.tencent.mm.storage.z3();
        }
        b2Var.P0(z3Var);
        return z3Var;
    }

    public java.lang.String A0() {
        java.lang.String str = this.field_signature;
        return str == null ? "" : str;
    }

    public java.lang.String D0() {
        java.lang.String str = this.field_username;
        return str == null ? "" : str;
    }

    public int F0() {
        r45.bb bbVar;
        r45.mz0 mz0Var = this.field_privacyInfo;
        if (mz0Var == null || (bbVar = (r45.bb) mz0Var.getCustom(1)) == null) {
            return 0;
        }
        return bbVar.getInteger(1);
    }

    public final boolean G0() {
        return this.field_spamStatus == 1;
    }

    public final boolean I0(java.lang.String str) {
        return !(str == null || str.length() == 0) && r26.n0.D(str, "Unable to convert BLOB to long", false, 2, null);
    }

    public final java.lang.String J0() {
        return "username:" + this.field_username + " nick:" + this.field_nickname + " signature:" + this.field_signature + " version:" + this.field_version + " follow_flag:" + this.field_follow_Flag + " head:" + this.field_avatarUrl + " converImg:" + this.field_coverImg + " spam:" + this.field_spamStatus + ", originalFlag:" + this.field_originalFlag + ", liveAnchorFlag:" + this.field_liveAnchorStatusFlag + ", liveSwitchFlag:" + this.field_liveSwitchFlag;
    }

    public final java.lang.String L0() {
        return "username:" + this.field_username + " nick:" + this.field_nickname + " signature:" + this.field_signature + " version:" + this.field_version + " follow_flag:" + this.field_follow_Flag + "  converImg:" + this.field_coverImg + " spam:" + this.field_spamStatus;
    }

    public final com.tencent.mm.storage.z3 P0(com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        contact.M1(z0());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String z07 = z0();
        ((ke0.e) xVar).getClass();
        contact.J2 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, z07);
        contact.X1(D0());
        contact.h3(this.field_signature);
        contact.E2 = this.systemRowid;
        contact.K2((int) (this.field_updateTime / 1000));
        r45.hz0 hz0Var = this.field_extInfo;
        java.lang.String string = hz0Var != null ? hz0Var.getString(2) : null;
        if (string == null) {
            string = "";
        }
        contact.L2(string);
        r45.hz0 hz0Var2 = this.field_extInfo;
        contact.g3(hz0Var2 != null ? hz0Var2.getInteger(3) : 0);
        r45.hz0 hz0Var3 = this.field_extInfo;
        java.lang.String string2 = hz0Var3 != null ? hz0Var3.getString(1) : null;
        contact.b3(string2 != null ? string2 : "");
        return contact;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // dm.z3, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        try {
            super.convertFrom(cursor);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LocalFinderContact", "convertFrom e: " + e17);
            if (I0(e17.getMessage())) {
                java.lang.String[] columnNames = cursor != null ? cursor.getColumnNames() : null;
                if (columnNames == null) {
                    return;
                }
                int length = columnNames.length;
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String str = columnNames[i17];
                    int hashCode = str.hashCode();
                    if (R2 == hashCode) {
                        this.field_username = cursor.getString(i17);
                        this.M2 += "field_username=" + this.field_username + ' ';
                    } else if (S2 == hashCode) {
                        this.field_nickname = cursor.getString(i17);
                        this.M2 += "field_nickname=" + this.field_nickname + ' ';
                    } else if (T2 == hashCode) {
                        this.field_avatarUrl = cursor.getString(i17);
                        this.M2 += "field_avatarUrl=" + this.field_avatarUrl + ' ';
                    } else if (U2 == hashCode) {
                        this.field_version = v0(cursor, i17, str, "version");
                        this.M2 += "field_version=" + this.field_version + ' ';
                    } else if (V2 == hashCode) {
                        this.field_firstPageMD5 = cursor.getString(i17);
                        this.M2 += "field_firstPageMD5=" + this.field_firstPageMD5 + ' ';
                    } else if (W2 == hashCode) {
                        this.field_signature = cursor.getString(i17);
                        this.M2 += "field_signature=" + this.field_signature + ' ';
                    } else if (X2 == hashCode) {
                        this.field_follow_Flag = cursor.getInt(i17);
                        this.M2 += "field_follow_Flag=" + this.field_follow_Flag + ' ';
                    } else if (Y2 == hashCode) {
                        this.field_pyInitial = cursor.getString(i17);
                        this.M2 += "field_pyInitial=" + this.field_pyInitial + ' ';
                    } else if (Z2 == hashCode) {
                        this.field_followTime = cursor.getInt(i17);
                        this.M2 += "field_followTime=" + this.field_followTime + ' ';
                    } else if (f460433a3 == hashCode) {
                        this.field_coverImg = cursor.getString(i17);
                        this.M2 += "field_coverImg=" + this.field_coverImg + ' ';
                    } else if (f460434b3 == hashCode) {
                        this.field_spamStatus = cursor.getInt(i17);
                        this.M2 += "field_spamStatus=" + this.field_spamStatus + ' ';
                    } else if (f460435c3 == hashCode) {
                        try {
                            byte[] blob = cursor.getBlob(i17);
                            if (blob != null && blob.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.FinderAuthInfo().parseFrom(blob);
                                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAuthInfo");
                                this.field_authInfo = (com.tencent.mm.protocal.protobuf.FinderAuthInfo) parseFrom;
                            }
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e18.getMessage());
                        }
                    } else if (f460436d3 == hashCode) {
                        try {
                            byte[] blob2 = cursor.getBlob(i17);
                            if (blob2 != null && blob2.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom2 = new r45.hz0().parseFrom(blob2);
                                kotlin.jvm.internal.o.e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderContactExtraInfo");
                                this.field_extInfo = (r45.hz0) parseFrom2;
                            }
                        } catch (java.io.IOException e19) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e19.getMessage());
                        }
                    } else if (f460437e3 == hashCode) {
                        this.field_originalFlag = cursor.getInt(i17);
                        this.M2 += "field_originalFlag=" + this.field_originalFlag + ' ';
                    } else if (F3 == hashCode) {
                        this.field_coverUrl = cursor.getString(i17);
                        this.M2 += "field_coverUrl=" + this.field_coverUrl + ' ';
                    } else if (G3 == hashCode) {
                        this.field_coverEntranceFlag = cursor.getInt(i17);
                        this.M2 += "field_coverEntranceFlag=" + this.field_coverEntranceFlag + ' ';
                    } else if (f460438f3 == hashCode) {
                        try {
                            byte[] blob3 = cursor.getBlob(i17);
                            if (blob3 != null && blob3.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom3 = new r45.yn2().parseFrom(blob3);
                                kotlin.jvm.internal.o.e(parseFrom3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalInfo");
                                this.field_originalInfo = (r45.yn2) parseFrom3;
                            }
                        } catch (java.io.IOException e27) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e27.getMessage());
                        }
                    } else if (f460439g3 == hashCode) {
                        this.field_extFlag = cursor.getInt(i17);
                        this.M2 += "field_extFlag=" + this.field_extFlag + ' ';
                    } else if (f460440h3 == hashCode) {
                        this.field_updateTime = v0(cursor, i17, str, dm.i4.COL_UPDATETIME);
                        this.M2 += "field_updateTime=" + this.field_updateTime + ' ';
                    } else if (f460441i3 == hashCode) {
                        this.field_retryCount = cursor.getInt(i17);
                        this.M2 += "field_retryCount=" + this.field_retryCount + ' ';
                    } else if (f460442j3 == hashCode) {
                        this.field_originalEntranceFlag = cursor.getInt(i17);
                        this.M2 += "field_originalEntranceFlag=" + this.field_originalEntranceFlag + ' ';
                    } else if (f460443k3 == hashCode) {
                        this.field_liveCoverImg = cursor.getString(i17);
                        this.M2 += "field_liveCoverImg=" + this.field_liveCoverImg + ' ';
                    } else if (f460444l3 == hashCode) {
                        this.field_liveStatus = cursor.getInt(i17);
                        this.M2 += "field_liveStatus=" + this.field_liveStatus + ' ';
                    } else if (f460445m3 == hashCode) {
                        this.field_liveAnchorStatusFlag = v0(cursor, i17, str, "liveAnchorStatusFlag");
                        this.M2 += "field_liveAnchorStatusFlag=" + this.field_liveAnchorStatusFlag + ' ';
                    } else if (f460446n3 == hashCode) {
                        this.field_friendFollowCount = cursor.getInt(i17);
                        this.M2 += "field_friendFollowCount=" + this.field_friendFollowCount + ' ';
                    } else if (f460447o3 == hashCode) {
                        this.field_liveSwitchFlag = v0(cursor, i17, str, "liveSwitchFlag");
                        this.M2 += "field_liveSwitchFlag=" + this.field_liveSwitchFlag + ' ';
                    } else if (f460448p3 == hashCode) {
                        this.field_liveAlias = cursor.getString(i17);
                        this.M2 += "field_liveAlias=" + this.field_liveAlias + ' ';
                    } else if (f460449q3 == hashCode) {
                        this.field_rewardTotalAmountInWecoin = v0(cursor, i17, str, "rewardTotalAmountInWecoin");
                        this.M2 += "field_rewardTotalAmountInWecoin=" + this.field_rewardTotalAmountInWecoin + ' ';
                    } else if (f460450r3 == hashCode) {
                        this.field_personalMsgUpdateTime = v0(cursor, i17, str, "personalMsgUpdateTime");
                        this.M2 += "field_personalMsgUpdateTime=" + this.field_personalMsgUpdateTime + ' ';
                    } else if (f460451s3 == hashCode) {
                        this.field_v5username = cursor.getString(i17);
                        this.M2 += "field_v5username=" + this.field_v5username + ' ';
                    } else if (f460452t3 == hashCode) {
                        this.field_vestNickname = cursor.getString(i17);
                        this.M2 += "field_vestNickname=" + this.field_vestNickname + ' ';
                    } else if (f460453u3 == hashCode) {
                        this.field_feedCount = cursor.getInt(i17);
                        this.M2 += "field_feedCount=" + this.field_feedCount + ' ';
                    } else if (f460454v3 == hashCode) {
                        this.field_source = cursor.getInt(i17);
                        this.M2 += "field_source=" + this.field_source + ' ';
                    } else if (f460455w3 == hashCode) {
                        this.field_liveMicSetting = v0(cursor, i17, str, "liveMicSetting");
                        this.M2 += "field_liveMicSetting=" + this.field_liveMicSetting + ' ';
                    } else if (f460456x3 == hashCode) {
                        this.field_liveMicSettingSwitch = v0(cursor, i17, str, "liveMicSettingSwitch");
                        this.M2 += "field_liveMicSettingSwitch=" + this.field_liveMicSettingSwitch + ' ';
                    } else if (f460457y3 == hashCode) {
                        try {
                            byte[] blob4 = cursor.getBlob(i17);
                            if (blob4 != null && blob4.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom4 = new r45.zl1().parseFrom(blob4);
                                kotlin.jvm.internal.o.e(parseFrom4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveBadgeInfoList");
                                this.field_badgeInfoList = (r45.zl1) parseFrom4;
                            }
                        } catch (java.io.IOException e28) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e28.getMessage());
                        }
                    } else if (f460458z3 == hashCode) {
                        try {
                            byte[] blob5 = cursor.getBlob(i17);
                            if (blob5 != null && blob5.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom5 = new r45.m36().parseFrom(blob5);
                                kotlin.jvm.internal.o.e(parseFrom5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SettleToAgencyRelateInfo");
                                this.field_settlementInfo = (r45.m36) parseFrom5;
                            }
                        } catch (java.io.IOException e29) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e29.getMessage());
                        }
                    } else if (A3 == hashCode) {
                        try {
                            byte[] blob6 = cursor.getBlob(i17);
                            if (blob6 != null && blob6.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom6 = new r45.l6().parseFrom(blob6);
                                kotlin.jvm.internal.o.e(parseFrom6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AgencyCollaborateInfo");
                                this.field_agencyCollaborateInfo = (r45.l6) parseFrom6;
                            }
                        } catch (java.io.IOException e37) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e37.getMessage());
                        }
                    } else if (B3 == hashCode) {
                        this.field_user_mode = cursor.getInt(i17);
                        this.M2 += "field_user_mode=" + this.field_feedCount + ' ';
                    } else if (C3 == hashCode) {
                        try {
                            byte[] blob7 = cursor.getBlob(i17);
                            if (blob7 != null && blob7.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom7 = new r45.aw0().parseFrom(blob7);
                                kotlin.jvm.internal.o.e(parseFrom7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindInfoList");
                                this.field_bindInfoList = (r45.aw0) parseFrom7;
                            }
                        } catch (java.io.IOException e38) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e38.getMessage());
                        }
                    } else if (D3 == hashCode) {
                        try {
                            byte[] blob8 = cursor.getBlob(i17);
                            if (blob8 != null && blob8.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom8 = new r45.za1().parseFrom(blob8);
                                kotlin.jvm.internal.o.e(parseFrom8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGuestInfo");
                                this.field_guestInfo = (r45.za1) parseFrom8;
                            }
                        } catch (java.io.IOException e39) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e39.getMessage());
                        }
                    } else if (J3 == hashCode) {
                        try {
                            byte[] blob9 = cursor.getBlob(i17);
                            if (blob9 != null && blob9.length > 0) {
                                com.tencent.mm.protobuf.f parseFrom9 = new r45.sc1().parseFrom(blob9);
                                kotlin.jvm.internal.o.e(parseFrom9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpInfoList");
                                this.field_jumpInfoList = (r45.sc1) parseFrom9;
                            }
                        } catch (java.io.IOException e47) {
                            com.tencent.mars.xlog.Log.e("LocalFinderContact", e47.getMessage());
                        }
                    } else if (H3 == hashCode) {
                        this.field_rawNickname = cursor.getString(i17);
                        this.M2 += "field_rawNickname=" + this.field_rawNickname + ' ';
                    } else if (I3 == hashCode) {
                        this.field_rawAvatarUrl = cursor.getString(i17);
                        this.M2 += "field_rawAvatarUrl=" + this.field_rawAvatarUrl + ' ';
                    } else if (E3 == hashCode) {
                        this.systemRowid = v0(cursor, i17, str, "rowid");
                        this.M2 += "systemRowid=" + this.systemRowid + ' ';
                    }
                }
                if (this.N2.length() > 0) {
                    pm0.v.K(null, new ya2.z1(this, e17, length));
                }
            }
        }
    }

    @Override // dm.z3, l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues convertTo = super.convertTo();
        if (convertTo.size() > 0) {
            pm0.v.K(null, new ya2.a2(convertTo));
        }
        return convertTo;
    }

    public java.lang.String getAvatarUrl() {
        java.lang.String str = this.field_avatarUrl;
        return str == null ? "" : str;
    }

    @Override // dm.z3, l75.f0
    public l75.e0 getDBInfo() {
        return O2;
    }

    public final ya2.b2 t0() {
        try {
            java.lang.Object clone = super.clone();
            kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
            return (ya2.b2) clone;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LocalFinderContact", "clone Contact error. e: " + e17);
            return null;
        }
    }

    public java.lang.String toString() {
        return J0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String u0() {
        /*
            r9 = this;
            r45.aw0 r0 = r9.field_bindInfoList
            r1 = 2
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L50
            java.util.LinkedList r0 = r0.getList(r5)
            if (r0 == 0) goto L50
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r6 = r0.hasNext()
            r7 = 4
            if (r6 == 0) goto L2e
            java.lang.Object r6 = r0.next()
            r8 = r6
            r45.zv0 r8 = (r45.zv0) r8
            int r8 = r8.getInteger(r5)
            if (r8 != r7) goto L2a
            r8 = r4
            goto L2b
        L2a:
            r8 = r5
        L2b:
            if (r8 == 0) goto L14
            goto L2f
        L2e:
            r6 = r3
        L2f:
            r45.zv0 r6 = (r45.zv0) r6
            if (r6 == 0) goto L50
            com.tencent.mm.protobuf.f r0 = r6.getCustom(r7)
            r45.fw0 r0 = (r45.fw0) r0
            if (r0 == 0) goto L50
            java.util.LinkedList r0 = r0.getList(r5)
            if (r0 == 0) goto L50
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.xk r0 = (r45.xk) r0
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L50
            goto L51
        L50:
            r0 = r2
        L51:
            int r6 = r0.length()
            if (r6 <= 0) goto L59
            r6 = r4
            goto L5a
        L59:
            r6 = r5
        L5a:
            if (r6 == 0) goto L5d
            return r0
        L5d:
            r45.aw0 r0 = r9.field_bindInfoList
            if (r0 == 0) goto La3
            java.util.LinkedList r0 = r0.getList(r5)
            if (r0 == 0) goto La3
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r0.next()
            r7 = r6
            r45.zv0 r7 = (r45.zv0) r7
            int r7 = r7.getInteger(r5)
            if (r7 != r4) goto L80
            r7 = r4
            goto L81
        L80:
            r7 = r5
        L81:
            if (r7 == 0) goto L6b
            goto L85
        L84:
            r6 = r3
        L85:
            r45.zv0 r6 = (r45.zv0) r6
            if (r6 == 0) goto La3
            com.tencent.mm.protobuf.f r0 = r6.getCustom(r4)
            r45.fw0 r0 = (r45.fw0) r0
            if (r0 == 0) goto La3
            java.util.LinkedList r0 = r0.getList(r5)
            if (r0 == 0) goto La3
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.xk r0 = (r45.xk) r0
            if (r0 == 0) goto La3
            java.lang.String r3 = r0.getString(r1)
        La3:
            if (r3 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.b2.u0():java.lang.String");
    }

    public final long v0(android.database.Cursor cursor, int i17, java.lang.String str, java.lang.String str2) {
        byte[] blob;
        boolean z17;
        try {
            return cursor.getLong(i17);
        } catch (java.lang.Exception e17) {
            if (!I0(e17.getMessage()) || (blob = cursor.getBlob(i17)) == null) {
                return 0L;
            }
            if (!(!(blob.length == 0))) {
                return 0L;
            }
            com.tencent.mm.protobuf.f fVar = null;
            for (java.lang.Class cls : K3) {
                try {
                    fVar = ((com.tencent.mm.protobuf.e) cls.newInstance()).parseFrom(blob);
                    z17 = true;
                } catch (java.lang.Exception unused) {
                    z17 = false;
                }
                if (z17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(this.N2);
                    sb6.append("index=");
                    sb6.append(i17);
                    sb6.append(" cursorColName=");
                    sb6.append(str);
                    sb6.append(" matchColName=");
                    sb6.append(str2);
                    sb6.append(" className=");
                    java.lang.String name = fVar != null ? fVar.getClass().getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    sb6.append(name);
                    sb6.append(" byteToString=");
                    sb6.append(new com.tencent.mm.protobuf.g(blob, 0, blob.length));
                    sb6.append(" \n");
                    this.N2 = sb6.toString();
                    return 0L;
                }
            }
            return 0L;
        }
    }

    public java.lang.String w0() {
        java.lang.String str = this.field_nickname;
        return str == null ? "" : str;
    }

    public java.lang.String y0() {
        java.lang.String str = this.field_rawAvatarUrl;
        if (str == null || str.length() == 0) {
            return getAvatarUrl();
        }
        java.lang.String field_rawAvatarUrl = this.field_rawAvatarUrl;
        kotlin.jvm.internal.o.f(field_rawAvatarUrl, "field_rawAvatarUrl");
        return field_rawAvatarUrl;
    }

    public java.lang.String z0() {
        java.lang.String str = this.field_rawNickname;
        if (str == null || str.length() == 0) {
            return w0();
        }
        java.lang.String field_rawNickname = this.field_rawNickname;
        kotlin.jvm.internal.o.f(field_rawNickname, "field_rawNickname");
        return field_rawNickname;
    }

    public b2() {
        this.G2 = true;
        this.H2 = this.field_follow_Flag;
        this.I2 = this.field_avatarUrl;
        this.M2 = "";
        this.N2 = "";
    }
}
