package ff;

/* loaded from: classes15.dex */
public class a implements io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ff.e f261572a;

    public a(ff.e eVar) {
        this.f261572a = eVar;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public boolean clipboardHasStrings() {
        android.content.ClipDescription primaryClipDescription;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.f261572a.f261579a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public java.lang.CharSequence getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        android.app.Activity activity = this.f261572a.f261579a;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getUri() != null) {
                    activity.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                }
                return itemAt.coerceToText(activity);
            } catch (java.io.FileNotFoundException unused) {
                return null;
            } catch (java.lang.SecurityException e17) {
                io.flutter.Log.w("SkylinePlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e17);
                return null;
            }
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void playSystemSound(io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType soundType) {
        ff.e eVar = this.f261572a;
        eVar.getClass();
        if (soundType == io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType.CLICK) {
            eVar.f261579a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void popSystemNavigator() {
        ff.e eVar = this.f261572a;
        ff.d dVar = eVar.f261581c;
        android.app.Activity activity = eVar.f261579a;
        if (!(activity instanceof androidx.activity.k)) {
            activity.finish();
        } else {
            try {
                ((androidx.activity.k) activity).getOnBackPressedDispatcher().c();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void restoreSystemUiOverlays() {
        this.f261572a.getClass();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setApplicationSwitcherDescription(io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription description) {
        ff.e eVar = this.f261572a;
        if (eVar.f261581c != null) {
            kotlin.jvm.internal.o.g(description, "description");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Activity activity = eVar.f261579a;
        if (i17 < 28) {
            activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(description.label, (android.graphics.Bitmap) null, description.color));
        }
        if (i17 >= 28) {
            activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(description.label, 0, description.color));
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setClipboardData(java.lang.String str) {
        ((android.content.ClipboardManager) this.f261572a.f261579a.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", str));
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setFrameworkHandlesBack(boolean z17) {
        this.f261572a.f261581c.getClass();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setPreferredOrientations(int i17) {
        this.f261572a.f261579a.setRequestedOrientation(i17);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setSystemUiChangeListener() {
        ff.e eVar = this.f261572a;
        android.view.View decorView = eVar.f261579a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new ff.b(eVar, decorView));
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void setSystemUiOverlayStyle(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle systemChromeStyle) {
        this.f261572a.getClass();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void share(java.lang.String str) {
        ff.e eVar = this.f261572a;
        eVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        android.app.Activity activity = eVar.f261579a;
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/luggage/skyline/plugin/SkylinePlatformPlugin", ya.a.SHARE, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/luggage/skyline/plugin/SkylinePlatformPlugin", ya.a.SHARE, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void showSystemOverlays(java.util.List list) {
        this.f261572a.getClass();
        list.size();
        for (int i17 = 0; i17 < list.size(); i17++) {
            int i18 = ff.c.f261578b[((io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay) list.get(i17)).ordinal()];
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void showSystemUiMode(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode) {
        this.f261572a.getClass();
        if (systemUiMode == io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK) {
            return;
        }
        io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public void vibrateHapticFeedback(io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        android.view.View decorView = this.f261572a.f261579a.getWindow().getDecorView();
        int i17 = ff.c.f261577a[hapticFeedbackType.ordinal()];
        if (i17 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i17 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i17 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i17 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i17 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }
}
