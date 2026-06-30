package u03;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f423462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u03.c f423463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(byte[] bArr, u03.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423462d = bArr;
        this.f423463e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u03.b(this.f423462d, this.f423463e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.String substring;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mm.flutter.plugin.proto.b bVar = new com.tencent.mm.flutter.plugin.proto.b();
            bVar.parseFrom(this.f423462d);
            java.lang.Object obj2 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ol(bVar.f67934e, bVar.f67935f, 2).f302834e;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = obj2 instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) obj2 : null;
            if (finderObject != null) {
                u03.c cVar = this.f423463e;
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                    dk4.a rj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rj(finderMedia, finderObject.getId(), true);
                    if (rj6 != null) {
                        ck4.c cVar2 = ck4.c.f42548a;
                        java.lang.String str = rj6.f234482s;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = rj6.f234484u;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.String str3 = rj6.f234483t;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int i17 = rj6.f234464a;
                        java.lang.String str4 = rj6.f234465b;
                        if (str4 == null) {
                            str4 = "xV2";
                        }
                        java.lang.String str5 = rj6.f234466c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        java.lang.String str6 = rj6.f234467d;
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = rj6.f234481r;
                        if (str7 == null) {
                            str7 = "";
                        }
                        cVar.getClass();
                        ck4.b b17 = cVar2.b(str, str2, str3, i17, str4, str5, str6, str7, null, "MicroMsg.FinderCdnTaskFactory");
                        b17.f42534d2 = bVar.f67934e;
                        b17.f42538h2 = rj6.f234485v;
                        b17.f42539i2 = rj6.f234486w;
                        b17.f42540j2 = rj6.f234470g * 1000;
                        b17.f42541k2 = rj6.f234487x;
                        java.lang.String nickname = finderObject.getNickname();
                        if (nickname == null) {
                            nickname = "";
                        }
                        b17.f42542l2 = nickname;
                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                        java.lang.String description = objectDesc2 != null ? objectDesc2.getDescription() : null;
                        if (description == null) {
                            description = "";
                        }
                        b17.f42543m2 = description;
                        if (android.text.TextUtils.isEmpty(description)) {
                            substring = "";
                        } else {
                            substring = description.substring(0, java.lang.Math.min(4, description.length()));
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                        }
                        b17.f42544n2 = substring;
                        return b17;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }
}
