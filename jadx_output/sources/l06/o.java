package l06;

/* loaded from: classes15.dex */
public abstract class o {

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f314888e = n16.g.m("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    public r06.x0 f314889a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.x f314890b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.v f314891c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.c0 f314892d;

    public o(e26.c0 c0Var) {
        if (c0Var == null) {
            a(0);
            throw null;
        }
        this.f314892d = c0Var;
        e26.u uVar = (e26.u) c0Var;
        uVar.b(new l06.k(this));
        this.f314890b = uVar.b(new l06.l(this));
        this.f314891c = uVar.c(new l06.m(this));
    }

    public static boolean A(o06.m mVar) {
        if (mVar != null) {
            return r16.i.j(mVar, l06.d.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(f26.o0 o0Var, n16.e eVar) {
        if (o0Var == null) {
            a(98);
            throw null;
        }
        if (eVar != null) {
            return K(o0Var.w0(), eVar);
        }
        a(99);
        throw null;
    }

    public static boolean C(f26.o0 o0Var, n16.e eVar) {
        if (o0Var == null) {
            a(135);
            throw null;
        }
        if (eVar != null) {
            return B(o0Var, eVar) && !o0Var.x0();
        }
        a(136);
        throw null;
    }

    public static boolean D(o06.m mVar) {
        if (mVar == null) {
            a(162);
            throw null;
        }
        if (mVar.a().getAnnotations().I(l06.w.f314933n)) {
            return true;
        }
        if (!(mVar instanceof o06.o1)) {
            return false;
        }
        o06.o1 o1Var = (o06.o1) mVar;
        boolean v17 = o1Var.v();
        o06.p1 c17 = o1Var.c();
        o06.q1 b17 = o1Var.b();
        if (c17 != null && D(c17)) {
            if (!v17) {
                return true;
            }
            if (b17 != null && D(b17)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(f26.o0 o0Var, n16.e eVar) {
        if (o0Var == null) {
            a(106);
            throw null;
        }
        if (eVar != null) {
            return !o0Var.x0() && B(o0Var, eVar);
        }
        a(107);
        throw null;
    }

    public static boolean F(f26.o0 o0Var) {
        if (o0Var == null) {
            a(137);
            throw null;
        }
        if (o0Var != null) {
            return B(o0Var, l06.w.f314920c) && !f26.z2.f(o0Var);
        }
        a(139);
        throw null;
    }

    public static boolean G(f26.o0 o0Var) {
        if (o0Var != null) {
            o06.j i17 = o0Var.w0().i();
            return (i17 == null || s(i17) == null) ? false : true;
        }
        a(92);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(f26.o0 r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L33
            boolean r1 = r4.x0()
            r2 = 0
            if (r1 != 0) goto L32
            f26.c2 r4 = r4.w0()
            o06.j r4 = r4.i()
            boolean r1 = r4 instanceof o06.g
            r3 = 1
            if (r1 == 0) goto L2e
            o06.g r4 = (o06.g) r4
            if (r4 == 0) goto L28
            l06.r r4 = u(r4)
            if (r4 == 0) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            if (r4 == 0) goto L2e
            r4 = r3
            goto L2f
        L28:
            r4 = 97
            a(r4)
            throw r0
        L2e:
            r4 = r2
        L2f:
            if (r4 == 0) goto L32
            r2 = r3
        L32:
            return r2
        L33:
            r4 = 95
            a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l06.o.H(f26.o0):boolean");
    }

    public static boolean I(o06.g gVar) {
        if (gVar != null) {
            return c(gVar, l06.w.f314918b) || c(gVar, l06.w.f314920c);
        }
        a(108);
        throw null;
    }

    public static boolean J(f26.o0 o0Var) {
        return o0Var != null && E(o0Var, l06.w.f314926g);
    }

    public static boolean K(f26.c2 c2Var, n16.e eVar) {
        if (c2Var == null) {
            a(102);
            throw null;
        }
        if (eVar != null) {
            o06.j i17 = c2Var.i();
            return (i17 instanceof o06.g) && c(i17, eVar);
        }
        a(103);
        throw null;
    }

    public static boolean L(o06.m mVar) {
        if (mVar == null) {
            a(10);
            throw null;
        }
        while (mVar != null) {
            if (mVar instanceof o06.d1) {
                return ((r06.z0) ((o06.d1) mVar)).f368566h.h(l06.x.f314955j);
            }
            mVar = mVar.e();
        }
        return false;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
            case 60:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case 87:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
            case 74:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case qc1.u.CTRL_INDEX /* 78 */:
            case 79:
            case 80:
            case 81:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
            case 60:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case 87:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                i18 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
            case 74:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case qc1.u.CTRL_INDEX /* 78 */:
            case 79:
            case 80:
            case 81:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
            case 60:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case 87:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case qc1.u.CTRL_INDEX /* 78 */:
            case 90:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_RELEASE /* 97 */:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX /* 159 */:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
            case 92:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
            case 94:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SEEK /* 95 */:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
            case 145:
            case 146:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
            case 151:
            case 152:
            case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i17) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
            case 74:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case qc1.u.CTRL_INDEX /* 78 */:
            case 79:
            case 80:
            case 81:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i17) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
            case 60:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case 87:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case qc1.u.CTRL_INDEX /* 78 */:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
                objArr[2] = "getArrayType";
                break;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
                objArr[2] = "getEnumType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
                objArr[2] = "isArray";
                break;
            case 90:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SEEK /* 95 */:
                objArr[2] = "isPrimitiveType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_RELEASE /* 97 */:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                objArr[2] = "isDefaultBound";
                break;
            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX /* 159 */:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
            case 60:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case 87:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                throw new java.lang.IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
            case 74:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
            case qc1.u.CTRL_INDEX /* 78 */:
            case 79:
            case 80:
            case 81:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    public static f26.z0 b(l06.o oVar, java.lang.String str) {
        if (str == null) {
            oVar.getClass();
            a(47);
            throw null;
        }
        f26.z0 k17 = oVar.k(str).k();
        if (k17 != null) {
            return k17;
        }
        a(48);
        throw null;
    }

    public static boolean c(o06.j jVar, n16.e eVar) {
        if (jVar == null) {
            a(104);
            throw null;
        }
        if (eVar != null) {
            return jVar.getName().equals(eVar.g()) && eVar.equals(r16.i.g(jVar));
        }
        a(105);
        throw null;
    }

    public static l06.r s(o06.m mVar) {
        if (mVar == null) {
            a(78);
            throw null;
        }
        if (!((java.util.HashSet) l06.w.f314919b0).contains(mVar.getName())) {
            return null;
        }
        return (l06.r) ((java.util.HashMap) l06.w.f314923d0).get(r16.i.g(mVar));
    }

    public static l06.r u(o06.m mVar) {
        if (mVar == null) {
            a(77);
            throw null;
        }
        if (!((java.util.HashSet) l06.w.f314917a0).contains(mVar.getName())) {
            return null;
        }
        return (l06.r) ((java.util.HashMap) l06.w.f314921c0).get(r16.i.g(mVar));
    }

    public static boolean y(f26.o0 o0Var) {
        if (o0Var != null) {
            return B(o0Var, l06.w.f314918b);
        }
        a(140);
        throw null;
    }

    public static boolean z(f26.o0 o0Var) {
        if (o0Var != null) {
            return B(o0Var, l06.w.f314927h);
        }
        a(89);
        throw null;
    }

    public void d(boolean z17) {
        n16.g moduleName = f314888e;
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        e26.c0 storageManager = this.f314892d;
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        r06.x0 x0Var = new r06.x0(moduleName, storageManager, this, null, null, null, 48, null);
        this.f314889a = x0Var;
        l06.c.f314878a.getClass();
        o06.e1 providerForModuleContent = ((c26.c) ((l06.c) l06.b.f314873b.getValue())).a(this.f314892d, this.f314889a, m(), q(), e(), z17);
        kotlin.jvm.internal.o.g(providerForModuleContent, "providerForModuleContent");
        x0Var.f368553n = providerForModuleContent;
        r06.x0 x0Var2 = this.f314889a;
        x0Var2.getClass();
        java.util.List z07 = kz5.z.z0(new r06.x0[]{x0Var2});
        kz5.r0 r0Var = kz5.r0.f314002d;
        x0Var2.f368552m = new r06.u0(z07, r0Var, kz5.p0.f313996d, r0Var);
    }

    public q06.b e() {
        return q06.a.f359477a;
    }

    public f26.z0 f() {
        f26.z0 k17 = k("Any").k();
        if (k17 != null) {
            return k17;
        }
        a(51);
        throw null;
    }

    public f26.o0 g(f26.o0 o0Var) {
        n16.b f17;
        n16.b bVar;
        o06.g a17;
        f26.z0 z0Var = null;
        if (o0Var == null) {
            a(68);
            throw null;
        }
        if (z(o0Var)) {
            if (o0Var.u0().size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            f26.o0 type = ((f26.l2) o0Var.u0().get(0)).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        f26.o0 h17 = f26.z2.h(o0Var);
        f26.o0 o0Var2 = (f26.o0) ((l06.n) ((e26.o) this.f314890b).invoke()).f314887b.get(h17);
        if (o0Var2 != null) {
            return o0Var2;
        }
        if (h17 == null) {
            r16.i.a(20);
            throw null;
        }
        int i17 = r16.i.f368658a;
        o06.j i18 = h17.w0().i();
        o06.v0 e17 = i18 == null ? null : r16.i.e(i18);
        if (e17 != null) {
            o06.j i19 = h17.w0().i();
            if (i19 != null) {
                java.util.Set set = l06.b0.f314874a;
                n16.g name = i19.getName();
                kotlin.jvm.internal.o.g(name, "name");
                if (l06.b0.f314877d.contains(name) && (f17 = v16.f.f(i19)) != null && (bVar = (n16.b) l06.b0.f314875b.get(f17)) != null && (a17 = o06.l0.a(e17, bVar)) != null) {
                    z0Var = a17.k();
                }
            }
            if (z0Var != null) {
                return z0Var;
            }
        }
        throw new java.lang.IllegalStateException("not array: " + o0Var);
    }

    public f26.z0 h(f26.d3 d3Var, f26.o0 o0Var) {
        if (d3Var == null) {
            a(83);
            throw null;
        }
        if (o0Var != null) {
            int i17 = p06.k.Z0;
            return i(d3Var, o0Var, p06.i.f350765a);
        }
        a(84);
        throw null;
    }

    public f26.z0 i(f26.d3 d3Var, f26.o0 o0Var, p06.k kVar) {
        if (d3Var == null) {
            a(79);
            throw null;
        }
        if (o0Var == null) {
            a(80);
            throw null;
        }
        if (kVar != null) {
            return f26.r0.c(f26.s1.b(kVar), k("Array"), java.util.Collections.singletonList(new f26.n2(d3Var, o0Var)));
        }
        a(81);
        throw null;
    }

    public o06.g j(n16.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        o06.g b17 = o06.s.b(l(), cVar, w06.d.f441946d);
        if (b17 != null) {
            return b17;
        }
        a(13);
        throw null;
    }

    public final o06.g k(java.lang.String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        o06.g gVar = (o06.g) ((e26.r) this.f314891c).invoke(n16.g.k(str));
        if (gVar != null) {
            return gVar;
        }
        a(15);
        throw null;
    }

    public r06.x0 l() {
        r06.x0 x0Var = this.f314889a;
        x0Var.getClass();
        if (x0Var != null) {
            return x0Var;
        }
        a(7);
        throw null;
    }

    public java.lang.Iterable m() {
        java.util.List singletonList = java.util.Collections.singletonList(new m06.a(this.f314892d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public f26.z0 n() {
        f26.z0 p17 = p();
        if (p17 != null) {
            return p17;
        }
        a(53);
        throw null;
    }

    public f26.z0 o() {
        f26.z0 k17 = k("Nothing").k();
        if (k17 != null) {
            return k17;
        }
        a(49);
        throw null;
    }

    public f26.z0 p() {
        f26.z0 A0 = f().A0(true);
        if (A0 != null) {
            return A0;
        }
        a(52);
        throw null;
    }

    public q06.f q() {
        return q06.e.f359479a;
    }

    public f26.z0 r(l06.r rVar) {
        if (rVar == null) {
            a(74);
            throw null;
        }
        f26.z0 z0Var = (f26.z0) ((l06.n) ((e26.o) this.f314890b).invoke()).f314886a.get(rVar);
        if (z0Var != null) {
            return z0Var;
        }
        a(75);
        throw null;
    }

    public f26.z0 t(l06.r rVar) {
        if (rVar == null) {
            a(54);
            throw null;
        }
        if (rVar == null) {
            a(16);
            throw null;
        }
        f26.z0 k17 = k(rVar.f314905d.h()).k();
        if (k17 != null) {
            return k17;
        }
        a(55);
        throw null;
    }

    public f26.z0 v() {
        f26.z0 k17 = k("String").k();
        if (k17 != null) {
            return k17;
        }
        a(66);
        throw null;
    }

    public o06.g w(int i17) {
        o06.g j17 = j(l06.x.f314951f.c(n16.g.k(m06.l.f322606c.f322608b + i17)));
        if (j17 != null) {
            return j17;
        }
        a(18);
        throw null;
    }

    public f26.z0 x() {
        f26.z0 k17 = k("Unit").k();
        if (k17 != null) {
            return k17;
        }
        a(65);
        throw null;
    }
}
