package rh5;

/* loaded from: classes3.dex */
public final class i implements db5.t4, com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f395827d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.k f395828e;

    /* renamed from: f, reason: collision with root package name */
    public final mf3.p f395829f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest f395830g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.media.base.image.TranslateMenuListener$changeTransLangListener$1 f395831h;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.ui.media.base.image.TranslateMenuListener$changeTransLangListener$1] */
    public i(androidx.appcompat.app.AppCompatActivity activity, mf3.k mediaInfo, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f395827d = activity;
        this.f395828e = mediaInfo;
        this.f395829f = apiCenter;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f395831h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.TranslateMenuListener$changeTransLangListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                kotlin.jvm.internal.o.g(event, "event");
                rh5.i iVar = rh5.i.this;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = iVar.f395830g;
                java.lang.String str = settingsTranslateLanguageRequest != null ? settingsTranslateLanguageRequest.f67822e : null;
                mf3.k kVar = iVar.f395828e;
                java.lang.String id6 = kVar.getId();
                sf3.g e17 = kVar.e();
                java.lang.String c17 = e17 != null ? e17.c() : null;
                java.lang.String str2 = id6 + c17;
                mf3.p pVar = iVar.f395829f;
                sf3.f fVar = (sf3.f) pVar.c(sf3.f.class);
                sf3.k Q3 = fVar != null ? fVar.Q3(kVar) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTransLangListener, eventSessionId: ");
                am.z1 z1Var = event.f54035g;
                sb6.append(z1Var.f8502a);
                sb6.append(", requestSessionId: ");
                sb6.append(str);
                sb6.append(", currentMediaInfoId: ");
                sb6.append(id6);
                sb6.append(", currentImgPath: ");
                sb6.append(c17);
                sb6.append(", currentState: ");
                sb6.append(Q3);
                com.tencent.mars.xlog.Log.i("MediaGallery.TranslateMenu", sb6.toString());
                if (str == null || !android.text.TextUtils.equals(str, z1Var.f8502a) || !android.text.TextUtils.equals(str, str2) || Q3 != sf3.k.f407399g) {
                    return false;
                }
                iVar.f395830g = null;
                eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
                if (bVar == null) {
                    return false;
                }
                ((eg3.g) bVar).T();
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        dead();
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String c17;
        rf3.u uVar;
        mf3.s sVar;
        alive();
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        mf3.p pVar = this.f395829f;
        if (valueOf != null && valueOf.intValue() == 16) {
            eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
            if (bVar != null) {
                mf3.p pVar2 = ((eg3.g) bVar).f252660o;
                rf3.q qVar = (rf3.q) pVar2.a(rf3.q.class);
                if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f326110m) != null) {
                    uVar.t(sVar);
                }
                rf3.h hVar = (rf3.h) pVar2.a(rf3.h.class);
                if (hVar != null) {
                    hVar.D();
                    return;
                }
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f395827d;
        mf3.k kVar = this.f395828e;
        if (valueOf != null && valueOf.intValue() == 18) {
            com.tencent.mars.xlog.Log.i("MediaGallery.TranslateMenu", "longClickMenu_translateFeedback");
            sf3.g e17 = kVar.e();
            c17 = e17 != null ? e17.c() : null;
            if (c17 == null || !com.tencent.mm.vfs.w6.j(c17)) {
                com.tencent.mars.xlog.Log.e("MediaGallery.TranslateMenu", "originalImagePath invalid: " + c17);
                return;
            } else {
                dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(c17);
                kotlin.jvm.internal.o.f(bj6, "getTranslationResult(...)");
                ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).wi(mn4.e.CHAT, bj6.field_originalImageFileId, bj6.field_originalImageAesKey, bj6.field_resultImageFileId, bj6.field_resultImageAesKey);
                dp.a.makeText(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.lwg), 1).show();
                return;
            }
        }
        if (valueOf != null && valueOf.intValue() == 19) {
            bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
            if (fVar != null) {
                fVar.S2(kVar);
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == 17) {
            java.lang.String id6 = kVar.getId();
            sf3.g e18 = kVar.e();
            c17 = e18 != null ? e18.c() : null;
            java.lang.String str = id6 + c17;
            com.tencent.mars.xlog.Log.i("MediaGallery.TranslateMenu", "changeLanguage, currentMediaInfoId: " + id6 + ", currentImgPath: " + c17);
            com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
            settingsTranslateLanguageRequest.f67821d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
            settingsTranslateLanguageRequest.f67822e = str;
            this.f395830g = settingsTranslateLanguageRequest.clone();
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(appCompatActivity, settingsTranslateLanguageRequest);
        }
    }
}
