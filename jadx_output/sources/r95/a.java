package r95;

/* loaded from: classes10.dex */
public abstract class a {
    public static final s95.y a(android.graphics.Rect toProto) {
        kotlin.jvm.internal.o.h(toProto, "$this$toProto");
        s95.x builder = s95.y.f405240i.toBuilder();
        builder.f405236d = toProto.left;
        builder.onChanged();
        builder.f405237e = toProto.top;
        builder.onChanged();
        builder.f405238f = toProto.right;
        builder.onChanged();
        builder.f405239g = toProto.bottom;
        builder.onChanged();
        s95.y buildPartial = builder.buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public static final android.graphics.Rect b(s95.y toRect) {
        kotlin.jvm.internal.o.h(toRect, "$this$toRect");
        return new android.graphics.Rect(toRect.f405242d, toRect.f405243e, toRect.f405244f, toRect.f405245g);
    }

    public static final r95.f c(rm5.j toTrackProto) {
        kotlin.jvm.internal.o.h(toTrackProto, "$this$toTrackProto");
        r95.f fVar = new r95.f();
        long j17 = toTrackProto.f397501c;
        s95.m0 m0Var = (s95.m0) fVar.a();
        m0Var.f405114d = j17;
        m0Var.onChanged();
        java.lang.String value = toTrackProto.f397499a;
        kotlin.jvm.internal.o.h(value, "value");
        s95.m0 m0Var2 = (s95.m0) fVar.a();
        m0Var2.getClass();
        m0Var2.f405115e = value;
        m0Var2.onChanged();
        s95.m0 m0Var3 = (s95.m0) fVar.a();
        int i17 = toTrackProto.f397500b;
        s95.u uVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? s95.u.UnknownType : s95.u.Audio : s95.u.Video : s95.u.Image;
        m0Var3.getClass();
        m0Var3.f405116f = uVar.getNumber();
        m0Var3.onChanged();
        fVar.f(new r95.e(toTrackProto.f397502d, toTrackProto.f397503e));
        fVar.g(new r95.e(toTrackProto.f397504f, toTrackProto.f397505g));
        float f17 = toTrackProto.f397506h;
        s95.m0 m0Var4 = (s95.m0) fVar.a();
        m0Var4.f405127t = f17;
        m0Var4.onChanged();
        float f18 = toTrackProto.f397507i;
        s95.m0 m0Var5 = (s95.m0) fVar.a();
        m0Var5.f405125r = f18;
        m0Var5.onChanged();
        int i18 = toTrackProto.f397511m;
        s95.m0 m0Var6 = (s95.m0) fVar.a();
        m0Var6.f405126s = i18;
        m0Var6.onChanged();
        long j18 = toTrackProto.f397508j;
        s95.m0 m0Var7 = (s95.m0) fVar.a();
        m0Var7.f405121n = j18;
        m0Var7.onChanged();
        int i19 = toTrackProto.f397509k;
        int i27 = toTrackProto.f397510l;
        s95.m0 m0Var8 = (s95.m0) fVar.a();
        m0Var8.f405122o = i19;
        m0Var8.onChanged();
        s95.m0 m0Var9 = (s95.m0) fVar.a();
        m0Var9.f405123p = i27;
        m0Var9.onChanged();
        android.graphics.Rect value2 = toTrackProto.f397513o;
        kotlin.jvm.internal.o.h(value2, "value");
        s95.n cropInfoBuilder = fVar.f393457b;
        kotlin.jvm.internal.o.c(cropInfoBuilder, "cropInfoBuilder");
        cropInfoBuilder.f405132d = a(value2);
        cropInfoBuilder.onChanged();
        s95.m0 m0Var10 = (s95.m0) fVar.a();
        s95.o build = fVar.f393457b.build();
        m0Var10.getClass();
        m0Var10.f405128u = build;
        m0Var10.onChanged();
        android.graphics.Rect value3 = toTrackProto.f397512n;
        kotlin.jvm.internal.o.h(value3, "value");
        s95.n cropInfoBuilder2 = fVar.f393457b;
        kotlin.jvm.internal.o.c(cropInfoBuilder2, "cropInfoBuilder");
        cropInfoBuilder2.f405133e = a(value3);
        cropInfoBuilder2.onChanged();
        s95.m0 m0Var11 = (s95.m0) fVar.a();
        s95.o build2 = fVar.f393457b.build();
        m0Var11.getClass();
        m0Var11.f405128u = build2;
        m0Var11.onChanged();
        if (toTrackProto.f397514p) {
            s95.v vVar = s95.v.Custom;
            fVar.e(1);
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r5 != 270) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final rm5.v d(s95.i r18, com.tencent.mm.timelineedit.TimelineEditor r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r95.a.d(s95.i, com.tencent.mm.timelineedit.TimelineEditor):rm5.v");
    }
}
