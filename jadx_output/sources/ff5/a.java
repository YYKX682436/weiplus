package ff5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ff5.a f261712a;

    /* renamed from: b, reason: collision with root package name */
    public static final gf5.o f261713b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f261714c;

    static {
        ff5.a aVar = new ff5.a();
        f261712a = aVar;
        gf5.z zVar = gf5.z.f271470d;
        gf5.e eVar = new gf5.e(zVar, 6.0d);
        gf5.e eVar2 = new gf5.e(gf5.z.f271471e, 5.0d);
        gf5.e eVar3 = new gf5.e(gf5.z.f271472f, 4.5d);
        gf5.e eVar4 = new gf5.e(gf5.z.f271473g, 2.0d);
        gf5.e eVar5 = new gf5.e(gf5.z.f271474h, 1.2d);
        gf5.e eVar6 = new gf5.e(gf5.z.f271475i, 2.5d);
        gf5.e eVar7 = new gf5.e(gf5.z.f271476m, 0.8d);
        gf5.z zVar2 = gf5.z.f271477n;
        gf5.e eVar8 = new gf5.e(zVar2, 4.0d);
        gf5.z zVar3 = gf5.z.f271478o;
        gf5.e eVar9 = new gf5.e(zVar3, 7.0d);
        gf5.z zVar4 = gf5.z.f271479p;
        gf5.o oVar = new gf5.o(120.0d, 2.0d, kz5.c0.i(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, new gf5.e(zVar4, 5.5d), new gf5.e(gf5.z.f271480q, 5.0d), new gf5.e(gf5.z.f271481r, 3.0d), new gf5.e(gf5.z.f271482s, 4.0d)), 0.08d, 60.0d, 0.005d, 35.0d, null, null, 384, null);
        f261713b = oVar;
        java.util.List i17 = kz5.c0.i("<", ">");
        gf5.c cVar = gf5.c.f271383e;
        jz5.l lVar = new jz5.l("xml", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(new gf5.b(cVar, i17, 90.0d, true)), kz5.c0.i(new gf5.d(zVar3, 12.0d), new gf5.d(zVar4, 8.0d)), 127, null));
        jz5.l lVar2 = new jz5.l("html", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(new gf5.b(cVar, kz5.c0.i("<", ">"), 90.0d, true)), kz5.c0.i(new gf5.d(zVar3, 12.0d), new gf5.d(zVar4, 8.0d)), 127, null));
        jz5.l lVar3 = new jz5.l("svg", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(new gf5.b(cVar, kz5.c0.i("<", ">"), 90.0d, true)), kz5.c0.i(new gf5.d(zVar3, 12.0d), new gf5.d(zVar4, 8.0d)), 127, null));
        java.util.List i18 = kz5.c0.i("{", "[");
        gf5.c cVar2 = gf5.c.f271384f;
        f261714c = kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("json", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(new gf5.b(cVar2, i18, 36.0d, false), new gf5.b(cVar, kz5.c0.i("\"", ":"), 24.0d, false)), null, 383, null)), new jz5.l("jsonl", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(new gf5.b(cVar2, kz5.c0.i("{", "["), 36.0d, false), new gf5.b(cVar, kz5.c0.i("\"", ":"), 24.0d, false)), null, 383, null)), new jz5.l("yaml", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.c0.i(":", "=", ","), 16.0d, false)), null, 383, null)), new jz5.l("toml", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.c0.i(":", "=", ","), 16.0d, false)), null, 383, null)), new jz5.l("prop", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.c0.i(":", "=", ","), 16.0d, false)), null, 383, null)), new jz5.l("csv", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.c0.i(":", "=", ","), 16.0d, false)), null, 383, null)), new jz5.l("markdown", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.c0.i("```", "\n#", "#"), 40.0d, false)), kz5.c0.i(new gf5.d(zVar, 3.0d), new gf5.d(zVar2, 3.0d)), 127, null)), new jz5.l("sql", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.b0.c(aVar.b(kz5.b0.c("SELECT"), 30.0d, true)), kz5.b0.c(new gf5.d(zVar, 6.0d)), 127, null)), new jz5.l("python", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(aVar.b(kz5.c0.i("def ", "class "), 28.0d, true), aVar.b(kz5.c0.i(":\n", ":\r\n"), 18.0d, false)), kz5.b0.c(new gf5.d(zVar2, 3.0d)), 127, null)), new jz5.l("kotlin", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(aVar.b(kz5.b0.c("fun "), 28.0d, true), aVar.b(kz5.c0.i("val ", "var "), 18.0d, true), aVar.b(kz5.b0.c("@"), 0.0d, false)), kz5.b0.c(new gf5.d(zVar2, 4.0d)), 127, null)), new jz5.l("javascript", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(aVar.b(kz5.c0.i("function ", "=>"), 22.0d, true), aVar.b(kz5.c0.i("const ", "let "), 18.0d, true)), null, 383, null)), new jz5.l("typescript", gf5.o.a(oVar, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, kz5.c0.i(aVar.b(kz5.c0.i("function ", "=>"), 22.0d, true), aVar.b(kz5.c0.i("const ", "let "), 18.0d, true)), null, 383, null)));
    }

    public final gf5.n a(gf5.n definition) {
        kotlin.jvm.internal.o.g(definition, "definition");
        java.lang.String name = definition.f271408a;
        kotlin.jvm.internal.o.g(name, "languageName");
        gf5.o oVar = (gf5.o) f261714c.get(name);
        if (oVar == null) {
            oVar = f261713b;
        }
        gf5.o detectionProfile = oVar;
        boolean z17 = definition.f271409b;
        char c17 = definition.f271416i;
        kotlin.jvm.internal.o.g(name, "name");
        gf5.g identifierConfig = definition.f271410c;
        kotlin.jvm.internal.o.g(identifierConfig, "identifierConfig");
        java.util.List rules = definition.f271411d;
        kotlin.jvm.internal.o.g(rules, "rules");
        java.util.Set extraIdentifierStartChars = definition.f271412e;
        kotlin.jvm.internal.o.g(extraIdentifierStartChars, "extraIdentifierStartChars");
        java.util.Set extraIdentifierPartChars = definition.f271413f;
        kotlin.jvm.internal.o.g(extraIdentifierPartChars, "extraIdentifierPartChars");
        java.util.Set lineBreakChars = definition.f271414g;
        kotlin.jvm.internal.o.g(lineBreakChars, "lineBreakChars");
        gf5.t numberRule = definition.f271415h;
        kotlin.jvm.internal.o.g(numberRule, "numberRule");
        kotlin.jvm.internal.o.g(detectionProfile, "detectionProfile");
        return new gf5.n(name, z17, identifierConfig, rules, extraIdentifierStartChars, extraIdentifierPartChars, lineBreakChars, numberRule, c17, detectionProfile);
    }

    public final gf5.b b(java.util.List list, double d17, boolean z17) {
        return new gf5.b(gf5.c.f271382d, list, d17, z17);
    }
}
