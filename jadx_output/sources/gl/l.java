package gl;

/* loaded from: classes14.dex */
public final class l extends gl.a {

    /* renamed from: c, reason: collision with root package name */
    public boolean f272767c;

    /* renamed from: d, reason: collision with root package name */
    public gl.q f272768d;

    /* renamed from: e, reason: collision with root package name */
    public android.bluetooth.BluetoothDevice f272769e;

    @Override // gl.r
    public boolean a() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (isWiredHeadsetOn || !fp.h.c(23)) {
            return isWiredHeadsetOn;
        }
        if (fp.h.c(23)) {
            android.media.AudioDeviceInfo[] devices = audioManager.getDevices(2);
            kotlin.jvm.internal.o.d(devices);
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "isWireHeadsetPluggedNew, deviceInfo type: %s", java.lang.Integer.valueOf(audioDeviceInfo.getType()));
                if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gl.a, gl.r
    public void b() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((android.media.AudioManager) systemService).setSpeakerphoneOn(false);
    }

    @Override // gl.r
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (this.f272767c) {
            this.f272767c = false;
            if (fp.h.a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            yj0.a.c(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToSpeaker", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToSpeaker", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
        }
        audioManager.setSpeakerphoneOn(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "routeToSpeaker succ");
        return new cv.v0(1, null, 1, 2, null);
    }

    @Override // gl.r
    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        audioManager.setSpeakerphoneOn(false);
        if (this.f272767c) {
            this.f272767c = false;
            if (fp.h.a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            yj0.a.c(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToEarPiece", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToEarPiece", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "routeToEarPiece succ");
        return new cv.v0(2, null, 1, 2, null);
    }

    @Override // gl.r
    public void e(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String name;
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1676458352:
                    if (action.equals("android.intent.action.HEADSET_PLUG")) {
                        try {
                            int intExtra = intent.getIntExtra("state", -1);
                            try {
                                java.lang.String stringExtra = intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "currentState " + intExtra + " and " + stringExtra + " and " + intent.getIntExtra("microphone", -1));
                                    if (intExtra == 0) {
                                        this.f272731a = null;
                                        java.lang.String str2 = stringExtra != null ? stringExtra : "";
                                        gl.q qVar = this.f272768d;
                                        if (qVar != null) {
                                            ((gl.i) qVar).nj(3, str2);
                                            return;
                                        }
                                        return;
                                    }
                                    if (stringExtra == null) {
                                        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o);
                                        kotlin.jvm.internal.o.f(string, "getString(...)");
                                        str = string;
                                    } else {
                                        str = stringExtra;
                                    }
                                    this.f272731a = new cv.v0(3, str, 0, 4, null);
                                    gl.q qVar2 = this.f272768d;
                                    if (qVar2 != null) {
                                        if (stringExtra == null) {
                                            stringExtra = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o);
                                            kotlin.jvm.internal.o.f(stringExtra, "getString(...)");
                                        }
                                        ((gl.i) qVar2).mj(3, stringExtra);
                                        return;
                                    }
                                    return;
                                } catch (java.lang.Exception e17) {
                                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                                    return;
                                }
                            } catch (java.lang.Exception e18) {
                                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                                return;
                            }
                        } catch (java.lang.Exception e19) {
                            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                            return;
                        }
                    }
                    return;
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        try {
                            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                            try {
                                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
                                if (intExtra2 == 10) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response  ACTION_STATE_CHANGED off");
                                    this.f272769e = null;
                                    this.f272767c = false;
                                    gl.q qVar3 = this.f272768d;
                                    if (qVar3 != null) {
                                        ((gl.i) qVar3).nj(4, null);
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "ACTION_STATE_CHANGED  prev state = " + intExtra3 + " and now state = " + intExtra2);
                                return;
                            } catch (java.lang.Exception e27) {
                                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                                return;
                            }
                        } catch (java.lang.Exception e28) {
                            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
                            return;
                        }
                    }
                    return;
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        try {
                            int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            try {
                                int intExtra5 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                                try {
                                    android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                    if (n(bluetoothDevice) && !m()) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", bluetoothDevice + " is normal watch ,must be led recycle calling switch to bt");
                                        return;
                                    }
                                    if (intExtra4 == 12) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response " + bluetoothDevice + " AUDIO_STATE_CHANGED connect");
                                        this.f272769e = bluetoothDevice;
                                        java.lang.String name2 = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                                        if (name2 == null) {
                                            name2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
                                            kotlin.jvm.internal.o.f(name2, "getString(...)");
                                        }
                                        cv.v0 v0Var = new cv.v0(4, name2, 0, 4, null);
                                        java.lang.String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                                        if (address == null) {
                                            address = "";
                                        }
                                        v0Var.f222519d = address;
                                        this.f272732b = v0Var;
                                        gl.q qVar4 = this.f272768d;
                                        if (qVar4 != null) {
                                            ((gl.i) qVar4).ij(4, bluetoothDevice != null ? bluetoothDevice.getName() : null, bluetoothDevice != null ? bluetoothDevice.getAddress() : null);
                                        }
                                        gl.q qVar5 = this.f272768d;
                                        if (qVar5 != null) {
                                            name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                                            ((gl.i) qVar5).hj(4, name != null ? name : "");
                                        }
                                    } else if (intExtra4 == 10 && kotlin.jvm.internal.o.b(this.f272769e, bluetoothDevice)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response " + bluetoothDevice + " AUDIO_STATE_CHANGED disconnect");
                                        this.f272769e = null;
                                        if (this.f272767c) {
                                            name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                                            gl.q qVar6 = this.f272768d;
                                            if (qVar6 != null) {
                                                ((gl.i) qVar6).nj(4, name);
                                            }
                                            this.f272767c = false;
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "AUDIO_STATE_CHANGED prev state = " + intExtra5 + " and now state = " + intExtra4 + " and device=" + bluetoothDevice);
                                    return;
                                } catch (java.lang.Exception e29) {
                                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e29));
                                    return;
                                }
                            } catch (java.lang.Exception e37) {
                                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e37));
                                return;
                            }
                        } catch (java.lang.Exception e38) {
                            boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e38));
                            return;
                        }
                    }
                    return;
                case 17117692:
                    if (action.equals("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED")) {
                        try {
                            android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            if (bluetoothDevice2 == null) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", bluetoothDevice2 + " ACTIVE_DEVICE_CHANGED");
                            if (n(bluetoothDevice2) && !m()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", bluetoothDevice2 + " is normal watch ,must be led recycle calling switch to bt");
                                return;
                            }
                            this.f272769e = bluetoothDevice2;
                            java.lang.String name3 = bluetoothDevice2.getName();
                            if (name3 == null) {
                                name3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
                                kotlin.jvm.internal.o.f(name3, "getString(...)");
                            }
                            cv.v0 v0Var2 = new cv.v0(4, name3, 0, 4, null);
                            java.lang.String address2 = bluetoothDevice2.getAddress();
                            kotlin.jvm.internal.o.f(address2, "getAddress(...)");
                            v0Var2.f222519d = address2;
                            this.f272732b = v0Var2;
                            gl.q qVar7 = this.f272768d;
                            if (qVar7 != null) {
                                java.lang.String name4 = bluetoothDevice2.getName();
                                if (name4 == null) {
                                    name4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
                                    kotlin.jvm.internal.o.f(name4, "getString(...)");
                                }
                                ((gl.i) qVar7).mj(4, name4);
                                return;
                            }
                            return;
                        } catch (java.lang.Exception e39) {
                            boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e39));
                            return;
                        }
                    }
                    return;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        try {
                            int intExtra6 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            try {
                                int intExtra7 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                                try {
                                    android.bluetooth.BluetoothDevice bluetoothDevice3 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                    if (n(bluetoothDevice3) && !m()) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", bluetoothDevice3 + " is normal watch ,must be led recycle calling switch to bt");
                                        return;
                                    }
                                    if (intExtra6 == 0 && kotlin.jvm.internal.o.b(this.f272769e, bluetoothDevice3)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response " + bluetoothDevice3 + " ACTION_CONNECTION_STATE_CHANGED disconnect");
                                        this.f272769e = null;
                                        if (this.f272767c) {
                                            this.f272767c = false;
                                            name = bluetoothDevice3 != null ? bluetoothDevice3.getName() : null;
                                            gl.q qVar8 = this.f272768d;
                                            if (qVar8 != null) {
                                                ((gl.i) qVar8).nj(4, name);
                                            }
                                        }
                                    } else if (intExtra6 == 2) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response " + bluetoothDevice3 + " ACTION_CONNECTION_STATE_CHANGED");
                                        this.f272769e = bluetoothDevice3;
                                        java.lang.String name5 = bluetoothDevice3 != null ? bluetoothDevice3.getName() : null;
                                        if (name5 == null) {
                                            name5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
                                            kotlin.jvm.internal.o.f(name5, "getString(...)");
                                        }
                                        cv.v0 v0Var3 = new cv.v0(4, name5, 0, 4, null);
                                        java.lang.String address3 = bluetoothDevice3 != null ? bluetoothDevice3.getAddress() : null;
                                        if (address3 == null) {
                                            address3 = "";
                                        }
                                        v0Var3.f222519d = address3;
                                        this.f272732b = v0Var3;
                                        gl.q qVar9 = this.f272768d;
                                        if (qVar9 != null) {
                                            name = bluetoothDevice3 != null ? bluetoothDevice3.getName() : null;
                                            ((gl.i) qVar9).mj(4, name != null ? name : "");
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "ACTION_CONNECTION_STATE_CHANGED " + bluetoothDevice3 + " prev state = " + intExtra7 + " and now state = " + intExtra6);
                                    return;
                                } catch (java.lang.Exception e47) {
                                    boolean z47 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e47));
                                    return;
                                }
                            } catch (java.lang.Exception e48) {
                                boolean z48 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e48));
                                return;
                            }
                        } catch (java.lang.Exception e49) {
                            boolean z49 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e49));
                            return;
                        }
                    }
                    return;
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        try {
                            android.bluetooth.BluetoothDevice bluetoothDevice4 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "ACTION_ACL_DISCONNECTED acl " + bluetoothDevice4);
                            if (kotlin.jvm.internal.o.b(bluetoothDevice4, this.f272769e)) {
                                this.f272769e = null;
                                if (this.f272767c) {
                                    name = bluetoothDevice4 != null ? bluetoothDevice4.getName() : null;
                                    gl.q qVar10 = this.f272768d;
                                    if (qVar10 != null) {
                                        ((gl.i) qVar10).nj(4, name);
                                    }
                                    this.f272767c = false;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "response ACTION_ACL_DISCONNECTED acl " + bluetoothDevice4);
                                return;
                            }
                            return;
                        } catch (java.lang.Exception e57) {
                            boolean z57 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "%s", com.tencent.mm.sdk.platformtools.z3.c(e57));
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // gl.r
    public java.lang.Object f(kotlin.coroutines.Continuation continuation) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        yj0.a.c(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToBluetooth", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        audioManager.startBluetoothSco();
        yj0.a.f(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToBluetooth", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        if (fp.h.a(31)) {
            audioManager.setBluetoothScoOn(true);
        }
        this.f272767c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "routeToBluetooth succ");
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f272769e;
        cv.v0 v0Var = new cv.v0(4, bluetoothDevice != null ? bluetoothDevice.getName() : null, 1);
        android.bluetooth.BluetoothDevice bluetoothDevice2 = this.f272769e;
        java.lang.String address = bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null;
        if (address == null) {
            address = "";
        }
        v0Var.f222519d = address;
        return v0Var;
    }

    @Override // gl.r
    public void g(int i17, java.lang.String str) {
    }

    @Override // gl.r
    public java.lang.Object h(kotlin.coroutines.Continuation continuation) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (this.f272767c) {
            this.f272767c = false;
            if (fp.h.a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            yj0.a.c(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToHeadset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToHeadset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
        }
        audioManager.setSpeakerphoneOn(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "routeToHeadset succ");
        cv.v0 v0Var = this.f272731a;
        return new cv.v0(3, v0Var != null ? v0Var.f222517b : null, 1);
    }

    @Override // gl.r
    public boolean i() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return mm1.g.a((android.media.AudioManager) systemService);
    }

    @Override // gl.r
    public void j(gl.q listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f272768d = listener;
    }

    @Override // gl.r
    public boolean k() {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            if (!((android.media.AudioManager) systemService).isBluetoothScoAvailableOffCall() && !m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "isBluetoothScoAvailableOffCall false");
                return false;
            }
            android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            if (l() && defaultAdapter != null && defaultAdapter.isEnabled()) {
                if (defaultAdapter.getBondedDevices() != null && !defaultAdapter.getBondedDevices().isEmpty()) {
                    java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                    kotlin.jvm.internal.o.f(bondedDevices, "getBondedDevices(...)");
                    for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                        if (bluetoothDevice.getBondState() == 12 && !n(bluetoothDevice)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "current bluetooth adapter can working");
                            return true;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "current bluetooth can not use");
                }
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "bluetooth state " + l() + " and " + defaultAdapter + " and " + defaultAdapter.isEnabled());
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClassicalAudioProfile", e17, null, new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean l() {
        try {
            int profileConnectionState = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ClassicalAudioProfile", "isConnectHeadset getProfileConnectionState: %s", java.lang.Integer.valueOf(profileConnectionState));
            return profileConnectionState == 2;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ClassicalAudioProfile", "exception in isConnectDevice()");
            return false;
        }
    }

    public final boolean m() {
        return ((java.util.ArrayList) ((com.tencent.mm.modelsimple.t) ((com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class))).wi()).contains(13);
    }

    public final boolean n(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        android.bluetooth.BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        return (bluetoothClass != null ? bluetoothClass.getDeviceClass() : 7936) == 1796;
    }

    @Override // gl.r
    public void release() {
        if (this.f272767c) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
            if (fp.h.a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            yj0.a.c(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "release", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "release", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            this.f272767c = false;
        }
    }
}
